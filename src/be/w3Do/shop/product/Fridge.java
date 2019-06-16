package be.w3Do.shop.product;

import be.w3Do.shop.Bill;
import be.w3Do.shop.Product;

public class Fridge extends Product {
    private int liter;
    private boolean Freezer;

    public Fridge(String name,String descr,double price,int capacity,boolean isFreezer){
        super(name,descr,price);
        this.liter=capacity;
        this.Freezer=isFreezer;
    }

    public int getLiter() {
        return liter;
    }

    public boolean isFreezer() {
        return Freezer;
    }

    @Override
    public void buy(Bill bill, Integer quantity){

    }

    @Override
    public String toString(){
        StringBuffer sb=new StringBuffer().append(super.toString()).append("\nConsommation: ").append(liter).append(" freeze: ").append(Freezer);
        return sb.toString();
    }

}
