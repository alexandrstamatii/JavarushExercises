package com.astamatii.javarushexc.javacore.L2.lesson_6;

//Исправь код, чтобы программа компилировалась.

public class L2_6_AbstractClass_2 {
    public static void main(String[] args) {

    }

    abstract public static class Pet {
        public String getName() {
            return "Я - котенок";
        }

        abstract public Pet getChild();
    }
}
