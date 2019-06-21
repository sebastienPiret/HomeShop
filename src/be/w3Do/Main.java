package be.w3Do;

import be.w3Do.shop.*;
import be.w3Do.shop.delivery.RelayDelivery;
import be.w3Do.shop.product.Fridge;
import be.w3Do.shop.product.Television;

public class Main {

    public static void main(String[] args) {

        Product cafe = new Television("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99,49, "LED");
        Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
        Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);

        Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");

        Bill bill = new Bill(customer, new RelayDelivery(27));
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);

        bill.generate(new FileWriter("facture_leblanc"));

        bill.generate(new Writer() {
            @Override
            public void start() {

            }

            @Override
            public void writeLine(String line) {
                System.out.println(line);
            }

            @Override
            public void stop() {

            }
        });

    }
}
