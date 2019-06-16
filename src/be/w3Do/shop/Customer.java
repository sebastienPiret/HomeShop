package be.w3Do.shop;

public class Customer {
    private String fullName;
    private String address;

    public Customer(String name,String address){
        this.fullName=name;
        this.address=address;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }
}
