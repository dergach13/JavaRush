package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей

Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» — «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500.

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 100);
        map.put("B", 200);
        map.put("C", 300);
        map.put("D", 400);
        map.put("E", 500);
        map.put("F", 600);
        map.put("G", 700);
        map.put("H", 800);
        map.put("I", 900);
        map.put("J", 1000);

        return map;

    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> pair = it.next();
            int value = pair.getValue();
            if (value < 500){
                it.remove();
            }
        }
    }

    public static void main(String[] args) {

//        HashMap<String, Integer> map = createMap();
//        System.out.println("--------BEFORE--------");
//        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
//        while(it.hasNext()){
//            Map.Entry<String, Integer> pair = it.next();
//            System.out.println(pair.getKey() + ": " + pair.getValue());
//        }
//
//        removeItemFromMap(map);
//
//        System.out.println("--------AFTER--------");
//        Iterator<Map.Entry<String, Integer>> it2 = map.entrySet().iterator();
//        while(it2.hasNext()){
//            Map.Entry<String, Integer> pair = it2.next();
//            System.out.println(pair.getKey() + ": " + pair.getValue());
//        }

    }
}