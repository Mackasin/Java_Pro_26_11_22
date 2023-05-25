package com.hillel.dzhurynskyi.homework.hm17;

import java.time.LocalDate;
import java.util.Objects;

public class Product {
    private static int tempId = 1;
    private int id;
    private TypesOfProducts productType;
    private double productPrice;
    private boolean haveDiscount;
    private LocalDate createDate;

    public Product(TypesOfProducts productType, double productPrice, boolean haveDiscount, LocalDate createDate) {
        this.id = tempId;
        this.productType = productType;
        this.productPrice = productPrice;
        this.haveDiscount = haveDiscount;
        this.createDate = createDate;
        tempId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypesOfProducts getProductType() {
        return productType;
    }

    public void setProductType(TypesOfProducts productType) {
        this.productType = productType;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public boolean isHaveDiscount() {
        return haveDiscount;
    }

    public void setHaveDiscount(boolean haveDiscount) {
        this.haveDiscount = haveDiscount;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && tempId == product.tempId && Double.compare(product.productPrice, productPrice) == 0 && haveDiscount == product.haveDiscount && Objects.equals(productType, product.productType) && Objects.equals(createDate, product.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tempId, productType, productPrice, haveDiscount, createDate);
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", productType=" + productType +
                ", productPrice=" + productPrice +
                ", haveDiscount=" + haveDiscount +
                ", createDate=" + createDate +
                "\n";
    }
}
