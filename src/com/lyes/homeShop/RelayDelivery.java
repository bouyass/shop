package com.lyes.homeShop;

public class RelayDelivery  implements Delivery{

    private int number;

    public RelayDelivery(int number){
        this.number = number;
    }

    @Override
    public double getPrice() {
        if (number >= 0 && number <= 22){
            return 0;
        }else if (number >= 23 && number <= 47){
            return 2.99;
        }else{
            return 4.99;
        }

    }
}
