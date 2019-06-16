package be.w3Do;

import be.w3Do.shop.Product;
import be.w3Do.shop.product.Fridge;

public class Main {

    public static void main(String[] args) {

        Fridge frigo=new Fridge("frigo biau","réfrigère bien",1000,120,false);
        System.out.println(frigo);

        frigo.setPrice(2000);
        frigo.look();

        System.out.println(frigo.getName());

    }
}
