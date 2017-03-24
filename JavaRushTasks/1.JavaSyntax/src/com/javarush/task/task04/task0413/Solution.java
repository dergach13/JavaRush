package com.javarush.task.task04.task0413;

/* 
День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        String dayName = "такого дня недели не существует";
        switch (day){
            case 1:
                dayName = "понедельник";
                break;
            case 2:
                dayName = "вторник";
                break;
            case 3:
                dayName = "среда";
                break;
            case 4:
                dayName = "четверг";
                break;
            case 5:
                dayName = "пятница";
                break;
            case 6:
                dayName = "суббота";
                break;
            case 7:
                dayName = "воскресенье";
                break;
        }
        System.out.println(dayName);
    }
}