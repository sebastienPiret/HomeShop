package be.w3Do.shop.product;

import be.w3Do.shop.Bill;
import be.w3Do.shop.Product;

public class Television extends Product {
    private int size;
    private String slabType;

    public Television(String name,String descr,double price,int size,String slab){
        super(name,descr,price);
        this.size=size;
        this.slabType=slab;
    }

    public int getSize() {
        return size;
    }

    public String getSlabType() {
        return slabType;
    }

    @Override
    public void buy(Bill bill, Integer quantity){

    }

    @Override
    public String toString(){
        StringBuffer sb=new StringBuffer().append(super.toString()).append("\ntaille: ").append(size).append(" Type de dalle: ").append(slabType);
        return sb.toString();
    }
}
