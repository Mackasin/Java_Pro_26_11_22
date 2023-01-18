package com.hillel.dzhurynskyi.homework.hm12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToList {
    public <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }
}
