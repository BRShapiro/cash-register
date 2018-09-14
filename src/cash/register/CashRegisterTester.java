package cash.register;

import java.util.Scanner;

public class CashRegisterTester {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        UPCScanner ItemScanner = new UPCScanner();
        Customer Bill = new Customer(reader);
        Cashier Lisa = new Cashier(Bill, ItemScanner);
        Bill.shop(Lisa);

    }
}