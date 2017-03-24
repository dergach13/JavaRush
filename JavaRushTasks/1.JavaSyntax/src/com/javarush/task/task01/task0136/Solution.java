package com.javarush.task.task01.task0136;

/* 
Да хоть на Луну!

сила тяжести на Луне составляет примерно 17% от силы тяжести на Земле

реализуй метод getWeight(int), который принимает вес тела (в Ньютонах) на Земле, и возвращает,
сколько это тело будет весить на Луне (в Ньютонах).
Тип возвращаемого значения — double.

Пример:
Метод getWeight вызывается с параметром 888.

Пример вывода:
150.96

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int weightEarth) {
        //напишите тут ваш код
        return weightEarth * 0.17;
    }
}