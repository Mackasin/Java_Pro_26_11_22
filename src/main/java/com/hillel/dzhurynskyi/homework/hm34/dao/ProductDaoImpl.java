package com.hillel.dzhurynskyi.homework.hm34.dao;

import com.hillel.dzhurynskyi.homework.hm34.data.Product;
import com.hillel.dzhurynskyi.homework.hm34.mapper.ProductsRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {
    private final ProductsRowMapper productsRowMapper;
    private final JdbcTemplate jdbcTemplate;

    public ProductDaoImpl(ProductsRowMapper productsRowMapper, JdbcTemplate jdbcTemplate) {
        this.productsRowMapper = productsRowMapper;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean deleteProduct(int id) {
        return jdbcTemplate.update("DELETE FROM market.products WHERE id=?", id) > 0;
    }

    @Override
    public boolean insertProduct(Product product) {
        return jdbcTemplate.update("insert into market.products(id,name, price) values (?,?,?)",product.getId(),product.getName(),product.getPrice()) > 0;
    }

    @Override
    public Product findProduct(int id) {
        return jdbcTemplate.queryForObject("select * from market.products where id=?", productsRowMapper, id);
    }

    @Override
    public List<Product> getAllProducts() {
        return jdbcTemplate.query("select * from market.products", productsRowMapper);
    }
}
