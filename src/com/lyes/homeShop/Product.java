package com.lyes.homeShop;

public class Product
{
    private String name;
    private String description;
    private double price;


    public Product(String nama,String description,double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * Display a full description of the product
     * **/
    public void look(){}


    /**
     * add the product to a bill
     * **/
    public void buy(Bill bill, Integer quantity){}

}
