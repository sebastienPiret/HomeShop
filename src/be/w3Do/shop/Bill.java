package be.w3Do.shop;

import be.w3Do.shop.exception.NoProductException;

import java.util.HashMap;
import java.util.Map;


public class Bill {
    private Customer customer;
    private Map<Product,Integer> products=new HashMap<Product,Integer>();
    private Delivery delivery;

    public Bill(Customer customer, Delivery delivery){
        this.customer=customer;
        this.delivery=delivery;
    }

    /**
     * ecrire la facture dans un fichier
     * @param writer in charge of writing
     */
    public void generate(Writer writer){
        if(products.isEmpty())
            throw new NoProductException();
        writer.start();
        writer.writeLine("HomeShop compagnie");
        writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");
        writer.writeLine("");
        writer.writeLine("Facture à l'attention de : ");
        writer.writeLine(customer.getFullName());
        writer.writeLine(customer.getAddress());
        writer.writeLine("");
        //writer.writeLine("Mode de livraison : " + delivery.getInfo());
        writer.writeLine("");
        writer.writeLine("Produits : ");
        writer.writeLine("-----------------------------------------------------");
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            writer.writeLine(product.getName() + " - " + product.getPrice() + " - " + quantity + " unité(s)");
            writer.writeLine(product.getDescription());
            writer.writeLine("");
        }
        writer.writeLine("Livraison : " + delivery.getPrice());
        writer.writeLine("-----------------------------------------------------");
        writer.writeLine("Total : " + this.getTotal());
        writer.stop();
    }

    /**
     * obtenir le montant total
     * @return total price
     */
    public double getTotal(){
        double total = delivery.getPrice();
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        return total;
    }

    /**
     * Add a product and his quantity to the bill
     * @param product product to add
     * @param quantity quantity of the product
     */
    public void addProduct(Product product, Integer quantity){
        this.products.put(product,quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
