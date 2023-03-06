package com.hillel.dzhurynskyi.homework.hm22;

import com.hillel.dzhurynskyi.homework.hm22.order.CoffeeOrderBoard;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        board.add("Alen");
        board.add("Yoda");
        board.add("Obi-van");
        board.add("John Snow");

        board.draw();

        board.deliver();

        board.deliver(3);
        board.deliver(5);
        board.draw();
        board.deliver();
        board.deliver();
        board.deliver();
    }
}
