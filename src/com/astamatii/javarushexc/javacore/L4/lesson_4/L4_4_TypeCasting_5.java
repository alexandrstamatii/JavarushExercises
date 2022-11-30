package com.astamatii.javarushexc.javacore.L4.lesson_4;

//Посмотри, что делает эта программа.
//Затем измени haveFun так, чтобы он вызывал метод:
//play(), если person имеет тип Player.
//dance(), если person имеет тип Dancer.

import java.io.BufferedReader;    
import java.io.InputStreamReader;

public class L4_4_TypeCasting_5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveFun(person);
        }
    }

    public static void haveFun(Person person) {
        //напишите тут ваш код
    	if(person instanceof Player)
    		((Player) person).play();
    	if(person instanceof Dancer)
    		((Dancer) person).dance();    
    }

    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("dancing");
        }
    }
}
