package com.example.dependencyinjection.model.domain;

public class FactureItem {
    private Product product;
    private Integer quantity;

    public FactureItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double calculatePrice() {
        return quantity * product.getPrice();
    }
}
