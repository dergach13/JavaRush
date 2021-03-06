package com.javarush.task.task04.task0415;

/* 
Правило треугольника

Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
«Треугольник существует.» — если треугольник с такими сторонами существует.
«Треугольник не существует.» — если треугольник с такими сторонами не существует.

Подсказка:
Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.

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

        int ab = a + b;
        int ac = a + c;
        int bc = b + c;

        if(ab > c & bc > a & ac > b){
            System.out.println("Треугольник существует.");
        } else{
            System.out.println("Треугольник не существует.");
        }
    }
}