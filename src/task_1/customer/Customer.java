package task_1.customer;

import java.util.Scanner;

public class Customer extends Human {

    private int id;
    private double balance;
    private double commission;
    private double commissionPercent = 2;

    protected void setCommissionPercent(double commissionPercent) {
        this.commissionPercent = commissionPercent;
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


    public void updateBalance(double money, Customer customer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input In OR Out: ");
        String inOrOut = scanner.next();
        switch (inOrOut) {
            case "in":
                if (money <= 0) {
                    System.out.println(money + " wrong parameter!!!");
                    return;
                }
                customer.balance += money;

                printInfo();
                break;
            case "out":
                if (money > customer.balance) {
                    System.out.println(money);
                    System.out.println(customer.balance);
                    System.out.println("wrong parameter");
                    return;
                }


                customer.commission = (money * customer.commissionPercent / 100);
                customer.balance -= money;
                customer.balance -= customer.commission;
                printInfo();
                break;
            default:
                System.out.println("Wrong parameter");
        }


    }


    @Override
    protected void printInfo() {
        super.printInfo();
        System.out.println("\nID: " + id +
                "\nBalance: " + balance +
                "\nCommission:" + commission);
    }


}
