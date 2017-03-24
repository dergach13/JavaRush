package com.javarush.task.task04.task0425;

/* 
Цель установлена!

Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.

Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:

для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.

Пример для чисел 4 6:
1

Пример для чисел -6 -6:
3

*/

import java.io.*;
import java.util.Scanner;

import static java.lang.Math.signum;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int x = (int)signum(scan.nextDouble());
        int y = (int)signum(scan.nextDouble());
        int quater = 0;

        switch (x){
            case 1:
                switch (y){
                    case 1:
                        quater = 1;
                        break;
                    case -1:
                        quater = 4;
                        break;
                }
                break;
            case -1:
                switch (y){
                    case 1:
                        quater = 2;
                        break;
                    case -1:
                        quater = 3;
                        break;
                }
                break;
        }

        if (quater > 0){
            System.out.println(quater);
        }
    }
}
