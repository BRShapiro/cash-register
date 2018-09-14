package cash.register;

import java.util.Scanner;

public class Customer {

    public Customer(Scanner request){

        scanner = request;

    }

    public void shop(Cashier c){

        int code = 1;

        while(code != 0){

            if(scanner.hasNextInt()) {
                code = scanner.nextInt();
                c.scan(code);

            }

            else{
                System.out.println("invalid character detected: try again");
                scanner.next();

            }

        }

        }

    private Scanner scanner;

}