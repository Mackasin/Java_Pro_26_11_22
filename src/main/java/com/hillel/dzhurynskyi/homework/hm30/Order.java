package com.hillel.dzhurynskyi.homework.hm30;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class Order {
    private int id;
    @JsonFormat(pattern = "yyyy-MM-dd::HH:mm:ss")
    private LocalDateTime date;
    private double cost;
    private List<Product> products;
}
