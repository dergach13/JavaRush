package com.javarush.task.task02.task0202;

/* 
Откуда берутся Person?

В классе Person объяви следующие переменные: name типа String, age типа int, weight типа int, money типа int.
В методе main создай объект Person, занеси его ссылку в переменную person.

*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person person = new Person();
    }

    public static class Person {
        //напишите тут ваш код
        private String name;
        private  int age;
        private int weight;
        private int money;
    }
}
