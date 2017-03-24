package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа

Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
«количество отрицательных чисел: а», «количество положительных чисел: б»,
где а, б — искомые значения.

Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3

Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < 3; i++){
            nums.add(scan.nextInt());
        }

        for (Integer i : nums){
            countPositive += (i > 0) ? 1 : 0;
            countNegative += (i < 0) ? 1 : 0;
        }

        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPositive);

    }
}
