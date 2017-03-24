package com.javarush.task.task03.task0304;

/* 
Задача на проценты

Реализуй метод addTenPercent, который увеличивает переданное целое число на 10%.
Исправь ошибку в сигнатуре метода.

*/

public class Solution {
    public static double addTenPercent(int i) {
        //напишите тут ваш код
        return 1.1 * i;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
