package com.lyes.homeShop;

public class ExpressDelivery implements Delivery {
    private String city;

    public ExpressDelivery(String city){
        this.city = city;
    }

    @Override
    public double getPrice() {
        if (this.city.equals("paris")){
            return 6.99;
        }else{
            return  9.99;
        }
    }

    @Override
    public String getInfo() {
        return "Express delivery";
    }
}
