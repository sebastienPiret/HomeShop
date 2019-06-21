package be.w3Do.shop.delivery;

import be.w3Do.shop.Delivery;

public class ExpressDelivery implements Delivery {
    private String city;

    public ExpressDelivery(String city){
        this.city=city;

    }

    @Override
    public double getPrice() {
        if (city.equals("Paris"))
            return 6.99;
        else
            return 9.99;
    }
}
