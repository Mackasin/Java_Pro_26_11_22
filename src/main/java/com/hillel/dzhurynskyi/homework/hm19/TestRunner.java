package com.hillel.dzhurynskyi.homework.hm19;

import com.hillel.dzhurynskyi.homework.hm19.anotations.AfterSuite;
import com.hillel.dzhurynskyi.homework.hm19.anotations.BeforeSuite;
import com.hillel.dzhurynskyi.homework.hm19.anotations.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class TestRunner {
    private static Object testObject;
    private static List<Method> beforeSuiteMethods = new ArrayList<>();
    private static List<Method> afterSuiteMethods = new ArrayList<>();
    private static List<Method> testMethods = new ArrayList<>();

    public static void start(Class<?> testClass) throws Exception {
        testObject = testClass.getDeclaredConstructor().newInstance();

        for (Method method : testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(BeforeSuite.class)) {
                beforeSuiteMethods.add(method);
            } else if (method.isAnnotationPresent(AfterSuite.class)) {
                afterSuiteMethods.add(method);
            } else if (method.isAnnotationPresent(Test.class)) {
                testMethods.add(method);
            }
        }

        if (beforeSuiteMethods.size() > 1) {
            throw new RuntimeException("There should be only one method with @BeforeSuite annotation");
        }

        if (afterSuiteMethods.size() > 1) {
            throw new RuntimeException("There should be only one method with @AfterSuite annotation");
        }

        testMethods.sort(Comparator.comparingInt(method -> method.getAnnotation(Test.class).priority()));

        if (beforeSuiteMethods.size() == 1) {
            beforeSuiteMethods.get(0).invoke(testObject);
        }

        for (Method method : testMethods) {
            method.invoke(testObject);
        }

        if (afterSuiteMethods.size() == 1) {
            afterSuiteMethods.get(0).invoke(testObject);
        }
    }
}

