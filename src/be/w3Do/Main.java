package be.w3Do;

import be.w3Do.shop.Product;

public class Main {

    public static void main(String[] args) {

        Product product=new Product("ordi","belle béte",1000);
        System.out.println(product.toString());

    }
}
