package task_1.custumer;

import java.util.Scanner;

public class Customer extends Human {

    private int id;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }


    public double getBalance() {
        return balance;
    }

    public Customer() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input customer id: ");
        int customerId = scanner.nextInt();
        System.out.println("Input customer balance: ");
        double customerBalance = scanner.nextDouble();


        if (balance < 0) {
            System.out.println("wrong balance " + customerBalance);

        } else {
            this.balance = customerBalance;
        }

        this.id = customerId;


    }


}
