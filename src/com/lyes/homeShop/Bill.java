package com.lyes.homeShop;

import java.util.ArrayList;
import java.util.Map;

public class Bill {

    private Customer customer;
    private Map<Product,Integer> products;
    private Delivery delivery;

    public Bill(Customer customer,Delivery delivery){
        this.customer = customer;
        this.delivery = delivery;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product,Integer> getProducts() {
        return products;
    }

    public void addProduct(Product product,Integer quantity){
        this.products.put(product,quantity);
    }




}
