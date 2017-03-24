package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа


Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» — если число отрицательное и четное,
«отрицательное нечетное число» — если число отрицательное и нечетное,
«ноль» — если число равно 0,
«положительное четное число» — если число положительное и четное,
«положительное нечетное число» — если число положительное и нечетное.

Пример для числа 100:
положительное четное число

Пример для числа -51:
отрицательное нечетное число

*/

import java.io.*;
import java.util.Scanner;

import static java.lang.Integer.signum;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        String result = "ноль";

        if (num != 0){
            String sign = (signum(num) == 1) ? "положительное" : "отрицательное";
            String even = (num % 2 == 0) ? "четное" : "нечетное";

            result = sign + " " + even + " число";
        }

        System.out.print(result);
    }
}
