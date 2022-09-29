package com.astamatii.javarushexc.javasyntaxzero;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class L5_6_UnwrappingExceptions {

	public static final String FAILED_TO_READ = "Не удалось прочесть файл.";
	public static final String FAILED_TO_WRITE = "Не удалось записать в файл.";

	public static FileManager fileManager = new FileManager();

	public static void main(String[] args) {
		// напишите тут ваш код
		try {
			fileManager.copyFile("book.txt", "book_final_copy.txt");
			fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
		} catch (RuntimeException e) {
			if (e.getCause() instanceof FileNotFoundException)
				System.out.println(FAILED_TO_READ);
			else if (e.getCause() instanceof FileSystemException)
				System.out.println(FAILED_TO_WRITE);
		}

	}
}

class FileManager {

	private void readFile(String filePath) throws FileNotFoundException {
		System.out.println("Читаем содержимое файла " + filePath);
	}

	private void writeFile(String filePath) throws FileSystemException {
		System.out.println("Записываем данные в файл " + filePath);
	}

	public void copyFile(String sourceFile, String destinationFile) {
		try {
			readFile(sourceFile);
			writeFile(destinationFile);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (FileSystemException e) {
			throw new RuntimeException(e);
		}
	}
}