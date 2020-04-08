package com.lyes.homeShop;

public class Fridge extends Product {

    private int liter;
    private boolean freezer;

    public int getLiter() {
        return liter;
    }

    public boolean isFreezer() {
        return freezer;
    }

    public Fridge(int liter, boolean freezer,String name,String description,double price){
        super(name,description,price);
        this.liter = liter;
        this.freezer = freezer;
    }


}
