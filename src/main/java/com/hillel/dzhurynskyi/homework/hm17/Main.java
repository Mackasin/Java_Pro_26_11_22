package com.hillel.dzhurynskyi.homework.hm17;


import static com.hillel.dzhurynskyi.homework.hm17.TypesOfProducts.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Products products = new Products();
        products.setProducts();
        System.out.println(products.showAllProducts());
        System.out.println("---------------");
        System.out.println(products.BooksWithPriceMoreThen250());
        System.out.println("---------------");
        System.out.println(products.booksWithDiscount());
        System.out.println("---------------");
        System.out.println(products.ProductWithMinPrice(BOOK));
        System.out.println("---------------");
        System.out.println(products.lastThreeProducts());
        System.out.println("---------------");
        System.out.println(products.sum(2020));
        System.out.println("---------------");
        System.out.println(products.MapProducts());
    }
}
