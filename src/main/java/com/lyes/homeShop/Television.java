package com.lyes.homeShop;

public class Television extends Product {

    private int size;
    private String slabType;

    public int getSize() {
        return size;
    }

    public String getSlabType() {
        return slabType;
    }

    public Television(int size,String slabType,String name,String description,double price){
        super(name,description,price);
        this.size = size;
        this.slabType = slabType;
    }


}
