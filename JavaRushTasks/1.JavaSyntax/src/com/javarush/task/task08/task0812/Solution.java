package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.*;

/*
Cамая длинная последовательность

1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 9, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            list.add(scan.nextInt());
        }

        int tmpCount = 1;
        int maxCount = 1;

        for(int i = 1; i < 10; i++){
            if (list.get(i).equals(list.get(i - 1))){
                tmpCount += 1;
                if (tmpCount > maxCount) maxCount = tmpCount;
            } else {
                tmpCount = 1;
            }
        }



        System.out.println(maxCount);


    }
}