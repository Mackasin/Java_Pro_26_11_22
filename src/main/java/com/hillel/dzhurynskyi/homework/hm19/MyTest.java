package com.hillel.dzhurynskyi.homework.hm19;

import com.hillel.dzhurynskyi.homework.hm19.anotations.AfterSuite;
import com.hillel.dzhurynskyi.homework.hm19.anotations.BeforeSuite;
import com.hillel.dzhurynskyi.homework.hm19.anotations.Test;

public class MyTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite");
    }

    @Test(priority = 3)
    public void test1() {
        System.out.println("Test1");
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("Test2");
    }

    @Test(priority = 1)
    public void test3() {
        System.out.println("Test3");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite");
    }
}

