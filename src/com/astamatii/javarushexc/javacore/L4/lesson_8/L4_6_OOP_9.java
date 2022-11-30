package com.astamatii.javarushexc.javacore.L4.lesson_8;

//Расширь функциональность программы, которая позволит производить манипуляции с валютами.
//В существующем абстрактном классе Money создай приватное поле amount типа double.
//Создай публичный геттер для поля amount(public double getAmount()), 
// чтобы к этому полю можно было получить доступ извне класса Money.
//В отдельных файлах создай классы Hryvnia, Ruble и USD, которые будут являться потомками класса Money.
//В классах Hryvnia, Ruble и USD реализуй метод getCurrencyName() 
// который будет возвращать название соответствующей валюты (строку) в виде аббревиатуры (USD, UAH, RUB).
//В классах Hryvnia, Ruble и USD реализуй публичный (public) конструктор, 
// который принимает один параметр и вызывает конструктор базового класса (super) с этим параметром.
//Заполни список allMoney объектами всех возможных в рамках условия задачи 
// и функциональности программы валют.

import java.util.ArrayList;
import java.util.List;

public class L4_6_OOP_9 {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //напишите тут ваш код
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    } 
}

abstract class Money {
    public Money(double amount) {
    }

    public abstract double getAmount();

    public abstract String getCurrencyName();
}