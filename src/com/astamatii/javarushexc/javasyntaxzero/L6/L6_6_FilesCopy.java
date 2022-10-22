package com.astamatii.javarushexc.javasyntaxzero.L6;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

// Напиши программу, которая будет считывать с клавиатуры пути к двум директориям 
// и копировать файлы из одной директории в другую (только файлы, директории игнорируй).
// Используй соответствующие методы класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), copy().

public class L6_6_FilesCopy {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(sourceDirectory)) {
        	for(Path path : stream) {
        		if(Files.isRegularFile(path))
        			Files.copy(path, targetDirectory.resolve(path.getFileName()));
        	}
        }
        
        // Javarush Solution:
//        try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {
//            for (Path path : files) {
//                if (Files.isRegularFile(path)) {
//                    Path resolve = targetDirectory.resolve(path.getFileName());
//                    Files.copy(path, resolve);
//                }
//            }
//        }

    }
}




// D:\Development\Javarush\
// D:\Development\Javarush\copy\