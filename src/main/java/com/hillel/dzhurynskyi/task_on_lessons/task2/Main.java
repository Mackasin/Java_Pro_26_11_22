package com.hillel.dzhurynskyi.task_on_lessons.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<FutureTask<Long>> futureTasks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {

            Callable<Long> clble = new Incriment(i * 100000, (i + 1) * 100000);

            FutureTask<Long> futureTask = new FutureTask<>(clble);
            futureTasks.add(futureTask);

            new Thread(futureTask).start();
        }
        long counter = 0;

        for (int j = 0; j < futureTasks.size(); j++) {

            FutureTask<Long> futureTask = futureTasks.get(j);
            counter += futureTask.get();
            System.out.println(j+": " + futureTask.get());
        }
        System.out.println("totall sum is "+ counter);
    }
}

