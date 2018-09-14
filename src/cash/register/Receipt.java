package cash.register;

import java.util.ArrayList;

public class Receipt {

    public Receipt(){

        cart = new ArrayList<Product>();
        screen = new Terminal();

    }

    public void addToCart(Product item){

        cart.add(item);
        screen.printCurrentProduct(item);

    }

    public void checkOut(){

        double total = 0;

        for(Product product: cart)
            total += product.getPrice();

        screen.printReceipt(cart, total);

    }

    private ArrayList<Product> cart;
    private Terminal screen;

}