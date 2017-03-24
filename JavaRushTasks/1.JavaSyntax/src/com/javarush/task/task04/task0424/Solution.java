package com.javarush.task.task04.task0424;

/* 
Три числа

пользователь вводит три числа с клавиатуры.
Затем происходит сравнение, и если мы находим число,
которое отличается от двух других, выводим на экран его порядковый номер.

*/

import java.io.*;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        int num = 0;

        if(!(a == b & b == c)){
            if( a == b){
                num = 3;
            } else if ( b == c){
                num  = 1;
            } else if (a == c){
                num = 2;
            }
        }

        if (num > 0){
            System.out.println(num);
        }
    }
}
