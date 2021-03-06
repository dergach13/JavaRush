package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа

Реализуй метод sumDigitsInNumber(int number).
Метод на вход принимает целое трехзначное число.
Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        Integer num = number;
        String intToStr = num.toString();
        int sum = 0;
        for (char c : intToStr.toCharArray()){
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }
}