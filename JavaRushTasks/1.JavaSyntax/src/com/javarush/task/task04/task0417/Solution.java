package com.javarush.task.task04.task0417;

/* 
Существует ли пара?

Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Пример для чисел 1 2 2:
2 2

Пример для чисел 2 2 2:
2 2 2

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        String pares = "";

        if(a == b){
            pares = a + " " + b;
            if( a == c){
                pares += " ";
                pares += c;
            }
        } else if (b == c){
            pares = b + " " + c;
        } else if (a == c){
            pares = a + " " + c;
        }

        //if (pares.length() > 0){
            System.out.print(pares);
        //}
    }
}