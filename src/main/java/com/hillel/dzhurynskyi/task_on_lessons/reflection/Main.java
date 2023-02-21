package com.hillel.dzhurynskyi.task_on_lessons.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
        Animal animal = new Animal("Cat", 10, true, "Cats");
        Method[] methods = Animal.class.getDeclaredMethods();


        Arrays.stream(methods)
                .filter(method -> method.getName().startsWith("get") || method.getName().startsWith("is"))
                .forEach(el-> {
                    try {
                        System.out.println( el.invoke(animal));
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                });

        System.out.println();


        System.out.println(Arrays.toString(methods));
    }
}
