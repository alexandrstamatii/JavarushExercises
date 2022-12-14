package com.astamatii.javarushexc.javacore.L8.lesson_5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Считать с консоли 2 имени файла: файл1, файл2.
//Записать в файл2 все байты из файл1, но в обратном порядке.
//Закрыть потоки.

public class L7_5_InputOutputStream_4 {
    public static void main(String[] args) {
    	List<Integer> fileList = new ArrayList<>();
    	
    	try (FileInputStream fileStream1 = new FileInputStream(
				new BufferedReader(new InputStreamReader(System.in)).readLine());
    			FileOutputStream fileStream2 = new FileOutputStream(
    					new BufferedReader(new InputStreamReader(System.in)).readLine())) {

    		int countBytes = fileStream1.available();
    		    		
    		while (fileStream1.available() > 0) {
    			fileList.add(fileStream1.read());
    		}
    		
    		Collections.reverse(fileList);
			
    		for (Integer i : fileList)
				fileStream2.write(i);
    				
			fileStream1.close();
			fileStream2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }    
}
