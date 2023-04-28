package com.hillel.dzhurynskyi.homework.hm34.mapper;

import com.hillel.dzhurynskyi.homework.hm34.data.Product;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ProductsRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs,int i) throws SQLException{
        return new Product(rs.getInt("id"),rs.getString("name"), rs.getDouble("price"));
    }
}
