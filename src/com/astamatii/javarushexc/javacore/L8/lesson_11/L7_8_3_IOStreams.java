package com.astamatii.javarushexc.javacore.L8.lesson_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//CRUD для таблицы внутри файла.
//Напиши программу, которая считывает с консоли путь к файлу для операций CRUD 
//	и при запуске в зависимости от флага, переданного в параметрах обновляет данные товара 
//	с заданным id или производит физическое удаление товара с заданным id 
//	(удаляет из файла все данные, которые относятся к переданному id).
//-u id productName price quantity
//-d id
//
//Значения параметров:
//-u - флаг, который означает обновление данных товара с заданным id
//-d - флаг, который означает физическое удаление товара с заданным id 
//	(из файла удаляются все данные, которые относятся к переданному id)
//id - id товара, 8 символов
//productName - название товара, 30 символов
//price - цена, 8 символов
//quantity - количество, 4 символа
//
//В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
//id productName price quantity
//
//Данные дополнены пробелами до их длины.
//
//Для чтения и записи файла нужно использовать FileReader и FileWriter соответственно.
//
//Пример содержимого файла:
//19847   Шорты пляжные синие           159.00  12
//198479  Шорты пляжные черные с рисунко173.00  17
//19847983Куртка для сноубордистов, разм10173.991234

public class L7_8_3_IOStreams {
    public static void main(String[] args) {

    }  
}
