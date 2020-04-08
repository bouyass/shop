package com.lyes.homeShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bill {
    private boolean costDelivery = true;
    private Customer customer;
    private Map<Product,Integer> products;
    private Delivery delivery;

    public Bill(Customer customer,Delivery delivery){
        this.customer = customer;
        this.delivery = delivery;
        this.products = new HashMap<Product, Integer>();
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

    public void generate(Writer writer){
        writer.start();
        writer.start();
        writer.writeLine("HomeShop compagnie");
        writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");
        writer.writeLine("");
        writer.writeLine("Facture à l'attention de : ");
        writer.writeLine(customer.getFullname());
        writer.writeLine(customer.getAddress());
        writer.writeLine("");
        writer.writeLine("Mode de livraison : " + delivery.getInfo());
        writer.writeLine("");
        writer.writeLine("Produits : ");
        writer.writeLine("-----------------------------------------------------");
        if (products.isEmpty()){
            writer.writeLine("\n\n\n Pas de produits dans la facture \n\n");
            this.costDelivery = false;
        }else{
            for (Map.Entry<Product, Integer> entry : products.entrySet()) {
                Product product = entry.getKey();
                Integer quantity = entry.getValue();
                writer.writeLine(product.getName() + " - " + product.getPrice() + " € - " + quantity + " unité(s)");
                writer.writeLine(product.getDescription());
                writer.writeLine("");
            }

        }
        if (this.costDelivery == true){
            writer.writeLine("Livraison : " + delivery.getPrice() + " €");
        }else{
            writer.writeLine("Livraison : " + 0.00 + " €");
            writer.writeLine("Il n'y a pas eu de livraison pour absence de produits");
        }
        writer.writeLine("-----------------------------------------------------");
        writer.writeLine("Total : " + this.getTotal() +" €");
        writer.stop();

    }

    public double getTotal(){
        double total = 0.00;
        if (this.costDelivery == true) {
            total = delivery.getPrice();
            for (Map.Entry<Product, Integer> entry : products.entrySet()) {
                Product product = entry.getKey();
                Integer quantity = entry.getValue();
                total += product.getPrice() * quantity;
            }
        }else{
            return total;
        }
        return total;
    }




}
