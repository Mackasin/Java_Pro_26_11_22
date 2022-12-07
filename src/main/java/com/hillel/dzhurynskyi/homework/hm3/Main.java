package com.hillel.dzhurynskyi.homework.hm3;

import com.hillel.dzhurynskyi.homework.hm3.car.Car;
import com.hillel.dzhurynskyi.homework.hm3.employee.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("Moloko Alex Petrovich","engineer","fdgdfahdf@mail.com","0670000455",25);
        System.out.println(employee);
        Car car=new Car();
        car.start();
    }
}
