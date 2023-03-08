package com.hillel.dzhurynskyi.task_on_lessons.task2;


import java.util.concurrent.Callable;

public class Incriment implements Callable<Long> {
    private long counter;
    private int a;
    private int b;

    public Incriment(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public Long call() {
            for (int i = a; i < b; i++) {
                counter += i;
            }
            return counter;
        }
    }

