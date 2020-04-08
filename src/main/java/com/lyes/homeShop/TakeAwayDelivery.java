package com.lyes.homeShop;

public class TakeAwayDelivery implements  Delivery{
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "Take away delivery";
    }
}
