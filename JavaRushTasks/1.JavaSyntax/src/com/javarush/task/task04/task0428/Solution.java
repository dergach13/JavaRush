package com.javarush.task.task04.task0428;

/* 
Положительное число
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.

Пример для чисел -4 6 6:
2

Пример для чисел -6 -6 -3:
0
*/

import java.io.*;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);

        int cnt = ( scan.nextInt() > 0) ? 1 : 0;
        cnt += ( scan.nextInt() > 0) ? 1 : 0;
        cnt += ( scan.nextInt() > 0) ? 1 : 0;

        System.out.println(cnt);

    }
}
