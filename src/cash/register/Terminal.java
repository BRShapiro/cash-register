package cash.register;

import java.util.ArrayList;

public class Terminal {

    public Terminal(){

        System.out.println("Scan an item to add it to the cart.");
        System.out.println("Push 'pay' to check out (0).");

    }

    public void printCurrentProduct(Product product){

        System.out.println("UPC: " + product.getUPC());
        System.out.println("item: " + product.getName());
        System.out.println("cost: $" + product.getPrice());

    }

    public void printReceipt(ArrayList<Product> items, double total){

        for(Product product: items)
            System.out.println(product.getUPC() + ": " + product.getName() + " ($" + product.getPrice() + ")");

        System.out.println("total: $" + total);

    }

}