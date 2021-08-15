package com.javarush.task.jdk13.task04.task0407;

/*
Подсчитать количество котов
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //напишите тут ваш код
        Cat.count = ++Cat.count;

        Cat cat2 = new Cat();
        //напишите тут ваш код
        Cat.count = ++Cat.count;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;

    }
}