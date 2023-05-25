package com.hillel.dzhurynskyi.homework.hm17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.hillel.dzhurynskyi.homework.hm17.TypesOfProducts.*;

public class Products {
    private List<Product> products;

    public void setProducts() {
        products = new ArrayList<>(List.of(
                new Product(BOOK, 457.45, true, LocalDate.of(2019, 11, 1)),
                new Product(TOY, 550.5, true, LocalDate.of(2020, 3, 8)),
                new Product(BOOK, 110.45, false, LocalDate.of(2019, 12, 2)),
                new Product(TOY, 550.56, true, LocalDate.of(2020, 3, 8)),
                new Product(TOY, 300.01, true, LocalDate.of(2020, 1, 30)),
                new Product(TOY, 1000.75, true, LocalDate.of(2019, 12, 5)),
                new Product(BOOK, 250.45, false, LocalDate.of(2019, 5, 11)),
                new Product(MILK, 40.59, false, LocalDate.of(2019, 12, 20)),
                new Product(CHOCOLATE, 100.44, false, LocalDate.of(2019, 4, 12)),
                new Product(BOOK, 60.15, true, LocalDate.of(2020, 2, 3)),
                new Product(CHOCOLATE, 100.1, false, LocalDate.of(2018, 7, 12))));
    }

    public List<Product> BooksWithPriceMoreThen250() {
        return products.stream()
                .filter(product -> BOOK.equals(product.getProductType()))
                .filter(product -> product.getProductPrice() > 250)
                .toList();
    }

    public List<Product> booksWithDiscount() {
        return products.stream()
                .filter(product -> BOOK.equals(product.getProductType()))
                .filter(Product::isHaveDiscount)
                .map(product -> new Product(product.getProductType(), product.getProductPrice() * 0.9, product.isHaveDiscount(), product.getCreateDate()))
                .toList();
    }

    public Double ProductWithMinPrice(TypesOfProducts types) {
        return products.stream()
                .filter(product -> types.equals(product.getProductType()))
                .map(Product::getProductPrice)
                .min(Comparator.naturalOrder())
                .orElseThrow(() -> new TypeOfProductsExeption(types));
    }

    public List<Product> lastThreeProducts() {
        return products.stream()
                .skip(products.size() - 3)
                .toList();
    }

    public double sum(int date) {
        return products.stream()
                .filter(product -> BOOK.equals(product.getProductType()))
                .filter(product -> product.getCreateDate().getYear() == date)
                .filter(product -> product.getProductPrice() <= 75)
                .mapToDouble(Product::getProductPrice)
                .sum();
    }
    public Map<TypesOfProducts,List<Product>> MapProducts(){
        return products.stream()
                .collect(Collectors.groupingBy(Product::getProductType));
    }

    public List<Product> showAllProducts(){
        return products;
    }
}
