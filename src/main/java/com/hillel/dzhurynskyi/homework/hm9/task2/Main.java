package com.hillel.dzhurynskyi.homework.hm9.task2;


public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("gg1", "12564154");
        phoneBook.add("gg2", "12356561");
        phoneBook.add("gg1", "12365641");
        phoneBook.add("gg3", "12365441");
        System.out.println(phoneBook.find("gg2"));
        System.out.println(phoneBook.find("gg4"));
        System.out.println(phoneBook.findAll("gg1"));
    }
}
