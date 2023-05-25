package com.hillel.dzhurynskyi.homework.hm30;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private double cost;
}
