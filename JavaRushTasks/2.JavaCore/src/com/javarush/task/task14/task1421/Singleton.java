package com.javarush.task.task14.task1421;

/**
 * Created by vixen on 08.07.17.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){};

    public static final Singleton getInstance() {
        if( instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
