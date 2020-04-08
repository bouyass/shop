package com.lyes.homeShop;

public class Customer {

    private String address;
    private String fullname;

    public Customer(String address,String fullname){
        this.address = address;
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }


    public String getAddress() {
        return address;
    }

}
