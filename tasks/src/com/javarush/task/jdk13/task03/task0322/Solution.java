package com.javarush.task.jdk13.task03.task0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Чистая любовь
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1= reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        System.out.print(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}