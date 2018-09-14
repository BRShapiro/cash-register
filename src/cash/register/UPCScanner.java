package cash.register;

import java.util.ArrayList;

public class UPCScanner {

    public UPCScanner(){

        products = new ArrayList<Product>();

        Product item1 = new Product(101,"Apple",0.80);
        Product item2 = new Product(102,"Chocolate",1.10);
        Product item3 = new Product(103,"Chips",1.00);
        Product item4 = new Product(104,"Peach",1.67);
        Product item5 = new Product(105,"Bacon",1.99);
        Product item6 = new Product(106,"Salsa",3.50);
        Product item7 = new Product(107,"Pizza",7.89);
        Product item8 = new Product(108,"Squash",1.35);
        Product item9 = new Product(109,"Banana",0.34);

        addToInventory(item1);
        addToInventory(item2);
        addToInventory(item3);
        addToInventory(item4);
        addToInventory(item5);
        addToInventory(item6);
        addToInventory(item7);
        addToInventory(item8);
        addToInventory(item9);

    }

    public void addToInventory(Product item){

        products.add(item);

    }

    public void addToPurchase(int code, Receipt receipt){

        boolean added = false;

        for(Product product: products)

            if(code == product.getUPC()) {
                receipt.addToCart(product);
                added = true;
            }

            if(added == false)
                System.out.println("invalid UPCode detected: try again");

    }

    private ArrayList<Product> products;

}