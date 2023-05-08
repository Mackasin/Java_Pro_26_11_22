package com.hillel.dzhurynskyi.homework.hm30;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Product {
    private int id;
    private String name;
    private double cost;
}
