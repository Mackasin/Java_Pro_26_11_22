package com.hillel.dzhurynskyi.homework.hm11;

import com.hillel.dzhurynskyi.homework.hm11.coffee.order.CoffeeOrderBoard;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add("o1");
        orderBoard.add("o2");
        orderBoard.add("o3");

        orderBoard.add("o1");
        orderBoard.add("o2");
        orderBoard.add("o3");
        orderBoard.add("o4");
        orderBoard.add("o5");

        orderBoard.add("o1");
        orderBoard.add("o2");
        orderBoard.add("o3");
        orderBoard.add("o4");
        orderBoard.add("o5");

        orderBoard.draw();

        orderBoard.deliver();
        orderBoard.deliver();
        orderBoard.deliver();
        orderBoard.deliver();
        orderBoard.deliver();

        orderBoard.draw();

        orderBoard.deliver(10);

        orderBoard.draw();
    }
}
