package be.w3Do.shop;

public class Product {
    private String name;
    private String description;
    private double price;

    /**
     * Display a full description of the product
     */
    public void look(){

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
}
