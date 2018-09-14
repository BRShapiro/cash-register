package cash.register;

/**
 * A product that exists in the system.
 */

public class Product {

    /**
     * Constructs product object.
     * @param prodUPCode UPC code of product
     * @param prodName name of product
     * @param prodPrice price of product
     */
    public Product(int prodUPCode, String prodName, double prodPrice){

        UPCode = prodUPCode;
        name = prodName;
        price = prodPrice;

    }

    /**
     * Gets UPCode of product.
     * @return UPC number
     */
    public int getUPC(){

        return UPCode;

    }

    public String getName(){

        return name;

    }

    public double getPrice(){

        return price;

    }

    private int UPCode;
    private String name;
    private double price;

}