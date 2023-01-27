package com.hillel.dzhurynskyi.homework.hm14.task1;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeList {

    final List<Object> list = new ArrayList<>();

    public void add(Object elem){
        synchronized (list){
            list.add(elem);
        }
    }

    public boolean remove(Object elem){
        synchronized (list){
            if (list.contains(elem) && !list.isEmpty()) {
                return list.remove(elem);
            }
            return false;
        }
    }

    public List<Object> get() {
        return list;
    }
}
