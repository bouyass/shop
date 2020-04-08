package com.lyes.homeShop;

public class Main {
    public static void main(String[] args) {
        Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
        Product tv = new Television(49, "LED", "TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599);
        Fridge fridge = new Fridge(130, false, "BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189);

        Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");

        Bill bill = new Bill(customer, new ExpressDelivery("Avignon"));
        bill.addProduct(cafe,4);
        bill.addProduct(tv,10);


        bill.generate(new FileWriter("facture_lyes_makhloufi"));

    }
}
