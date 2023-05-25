package com.hillel.dzhurynskyi.homework.hm34.dao;

import com.hillel.dzhurynskyi.homework.hm34.data.Cart;
import com.hillel.dzhurynskyi.homework.hm34.data.Product;
import com.hillel.dzhurynskyi.homework.hm34.mapper.ProductsRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CartDaoImpl implements CartDao {
    private JdbcTemplate jdbcTemplate;
    private ProductsRowMapper productsRowMapper;

    public CartDaoImpl(JdbcTemplate jdbcTemplate, ProductsRowMapper productsRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.productsRowMapper = productsRowMapper;
    }

    @Override
    public void insert(Cart cart) {
        jdbcTemplate.update("INSERT INTO market.carts () VALUES ()");
        int cartId = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        for (Product product : cart.getProducts()) {
            jdbcTemplate.update("INSERT INTO market.products_carts (cart_id, product_id) VALUES (?, ?)", cartId, product.getId());
        }
    }

    public void insert(int id,Cart cart){
        for (Product product : cart.getProducts()) {
            jdbcTemplate.update("INSERT INTO market.products_carts (cart_id, product_id) VALUES (?, ?)", id, product.getId());
        }
    }

    @Override
    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM market.carts WHERE id=?", id);
        jdbcTemplate.update("DELETE FROM market.products_carts WHERE cart_id=?", id);
    }

    @Override
    public Cart find(int id) {
        List<Product> products = jdbcTemplate.query("SELECT p.id, p.name, p.price FROM market.products p " +
                "JOIN market.products_carts pc ON p.id = pc.product_id " +
                "WHERE pc.cart_id=?",productsRowMapper,id);
        return new Cart(products);
    }

}
