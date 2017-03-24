package com.javarush.task.task03.task0303;

/* 
Обмен валют

Реализуй метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызови его дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс

*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(1,0.9));
        System.out.println(convertEurToUsd(10,0.95));
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        double dollar = eur * course;
        return dollar;
    }
}
