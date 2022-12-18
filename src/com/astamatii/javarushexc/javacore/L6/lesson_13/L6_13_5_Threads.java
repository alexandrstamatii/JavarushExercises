package com.astamatii.javarushexc.javacore.L6.lesson_13;

//1. В методе run после всех действий поставь задержку в 10 миллисекунд. Выведи "Нить прервана", 
//	если нить будет прервана.
//2. Сделай так, чтобы все нити выполнялись последовательно: сначала для нити №1 отсчет с COUNT до 1, 
//	потом для нити №2 с COUNT до 1 и т.д.
//
//Пример:
//#1: 4
//#1: 3
//...
//#1: 1
//#2: 4
//...

public class L6_13_5_Threads {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread();
            //напишите тут ваш код
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countdownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while (true) {
                System.out.println(this);
                if (--countdownIndex == 0) return;
                //напишите тут ваш код
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countdownIndex;
        }
    }  
}
