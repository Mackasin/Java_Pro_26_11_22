package com.hillel.dzhurynskyi.homework.hm30;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Order {
    private int id;
    private LocalDateTime date;
    private double cost;
    private List<Product> products;
}
