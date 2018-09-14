package cash.register;

public class Cashier {

    public Cashier(Customer c, UPCScanner s){

        customer = c;
        itemScanner = s;
        receipt = new Receipt();

    }

    public void scan(int code){

        if(code == 0)
            checkOut();
        else
            itemScanner.addToPurchase(code,receipt);

    }

    public void checkOut(){

        receipt.checkOut();

    }

    private Customer customer;
    private UPCScanner itemScanner;
    private Receipt receipt;

}