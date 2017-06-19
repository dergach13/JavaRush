package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые


1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(scan.nextLine());
        }

        int short_len = list.get(0).length(),
            long_len = list.get(0).length(),
            short_index = 0,
            long_index = 0;

        for(int i = 1; i < 10; i++){
            if(list.get(i).length() > long_len){
                long_len = list.get(i).length();
                long_index = i;
            }
            if(list.get(i).length() < short_len){
                short_len = list.get(i).length();
                short_index = i;
            }
        }

        int index = (short_index < long_index) ? short_index : long_index;

        System.out.println(list.get(index));
    }
}
