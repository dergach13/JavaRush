package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число

Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.

*/

import java.io.*;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if( num < 0 ){
            num += 1;
        }else if( num > 0){
            num *= 2;
        }
        System.out.println(num);
    }

}