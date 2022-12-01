package com.astamatii.javarushexc.javacore.L4.lesson_8;

//Давай напишем программу, которая определит, чем заняться тому или иному человеку.
//Для этого нужно:
//Ввести [в цикле] с клавиатуры несколько строк (ключей).
//Строки (ключи) могут быть такими: "user", "loser", "coder", "proger".
//Ввод окончен, когда строка не совпадает ни с одной из выше указанных.
//Для каждой введенной строки нужно:
//Создать соответствующий объект [см. Person.java], например,
// для строки "user" нужно создать объект класса User.
//Передать этот объект в метод doWork.
//Написать реализацию метода doWork, который:
//Вызывает метод live() у переданного объекта, если этот объект (person) имеет тип User.
//Вызывает метод doNothing(), если person имеет тип Loser.
//Вызывает метод writeCode(), если person имеет тип Coder.
//Вызывает метод enjoy(), если person имеет тип Proger.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L4_6_OOP_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        {
            //создаем объект, пункт 2

            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        // пункт 3
    } 
}

interface Person {
    class User implements Person {
        void live() {
            System.out.println("I usually just live.");
        }
    }

    class Loser implements Person {
        void doNothing() {
            System.out.println("I usually do nothing.");
        }
    }                            

    class Coder implements Person {
        void writeCode() {
            System.out.println("I usually write code.");
        }
    }

    class Proger implements Person {
        void enjoy() {
            System.out.println("It's a wonderful life!");
        }
    }  

}    