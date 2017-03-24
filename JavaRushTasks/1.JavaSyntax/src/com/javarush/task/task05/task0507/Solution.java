package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое

Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.

Пример для чисел 1 2 2 4 5 -1:
2.8

Пример для чисел 4 3 2 1 -1:
2.5

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        int cnt = 0;

        while(true){
            int curVal = scan.nextInt();
            if( curVal == -1 ){
                break;
            }
            sum += curVal;
            cnt += 1;
        }

        if(cnt > 0){
            double avg = sum/cnt;
            System.out.println(avg);
        }
    }
}

