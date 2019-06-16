package be.w3Do.shop;

import java.lang.String;

public class Product {
    private String name;
    private String description;
    private double price;

    public Product(String name,String descr,double price){
        this.name=name;
        this.description=descr;
        this.price=price;
    }

    /**
     * Display a full description of the product
     */
    public void look(){
        System.out.println(this.toString());
    }

    /**
     * Add the product to a bill
     * @param bill the concerned bill
     * @param quantity the quantity to add
     */
    public void buy(Bill bill,Integer quantity){

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        //StringBuffer sb=new StringBuffer().append(name).append(" : ").append(price).append("/n").append(description);
        return new StringBuffer(name).append(" : ").append(price).append("\n").append(description).toString();
        //return "test";
    }
}
