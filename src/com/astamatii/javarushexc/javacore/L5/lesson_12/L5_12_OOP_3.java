package com.astamatii.javarushexc.javacore.L5.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

//Напиши метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа, включая его.
//
//Пример вычислений: 4! = factorial(4) = 1*2*3*4
//Пример вывода: 24
//
//Для этого:
//1. Введи с консоли число меньше либо равно 150.
//2. Реализуй функцию factorial.
//3. Если введенное число меньше 0, выведи 0.
//
//0! = 1

public class L5_12_OOP_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here

        return "";
    }
}
