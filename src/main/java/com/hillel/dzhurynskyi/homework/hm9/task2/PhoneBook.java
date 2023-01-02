package com.hillel.dzhurynskyi.homework.hm9.task2;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private  List<Record> records=new ArrayList<>();


    public void add(String name, String numb){
        records.add(new Record(name,numb));
    }

    public Record find(String name) {
        for (Record elem : records) {
            if (elem.getName().equals(name)) {
                return elem;
            }
        }
        return null;
    }
    public List<Record> findAll(String name) {
        List<Record> result = new ArrayList<>();
        for (Record elem : records) {
            if (elem.getName().equals(name)) {
                result.add(elem);
            }
        }

        if (result.isEmpty()) {
            return null;
        } else {
            return result;
        }
    }

}
