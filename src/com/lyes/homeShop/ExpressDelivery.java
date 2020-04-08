package com.lyes.homeShop;

public class ExpressDelivery implements Delivery {
    private String address;

    public ExpressDelivery(String address){
        this.address = address;
    }

    @Override
    public double getPrice() {
        if (address == "paris"){
            return 6.99;
        }else{
            return  9.99;
        }
    }
}
