package com.astamatii.javarushexc.javacore.L4.lesson_8;

//Давай найдем наибольший общий делитель (НОД). Для этого:
//Введи с клавиатуры 2 целых положительных числа.
//Выведи в консоли наибольший общий делитель.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;  

public class L4_6_OOP_12 {
    public static void main(String[] args) throws Exception {
    	BufferedReader bufreader = new BufferedReader(new InputStreamReader(System.in));
    	int a = Integer.parseInt(bufreader.readLine());
    	int b = Integer.parseInt(bufreader.readLine());
    	
    	ArrayList<Integer> first = new ArrayList<>();
    	ArrayList<Integer> second = new ArrayList<>();
    	
    	for(int i = 0; i <= a; i++) {
    		if(a % i == 0) 
    			first.add(i);
    	}
    	
    	for(int i = 0; i <= b; i++) {
    		if(b % i == 0) 
    			second.add(i);
    	}
    	
    	bufreader.close();
    } 
}
