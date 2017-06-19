package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность

1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран номер первого элемента, нарушающего такую упорядоченность.

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            list.add(scan.nextLine());
        }

        int index = 0;

        for (int i = 1; i < 10; i++){
            if (list.get(i).length() < list.get(i - 1).length() & index == 0){
                index = i;
            }
        }

        if (index > 0) {
            System.out.println(index);
        }

    }
}

