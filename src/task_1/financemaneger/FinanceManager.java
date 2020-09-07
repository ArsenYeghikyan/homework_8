package task_1.financemaneger;

import task_1.custumer.Customer;



public class FinanceManager {
 private   double balanceAfterChanges;

    public void cashIn(double deposit, Customer customer) {
        balanceAfterChanges = customer.getBalance();
        if (deposit <= 0) {

            System.out.println(deposit + " wrong parameter");
            return;
        }


        customer.setBalance(customer.getBalance() + deposit);
        ;

        printCustomerInfo(customer);

    }

    public void cashOut(double cash, Customer customer) {
        balanceAfterChanges = customer.getBalance();
        if (cash > customer.getBalance()) {
            System.out.println(cash);
            System.out.println(customer.getBalance());
            System.out.println("wrong parameter");
            return;
        }
        customer.setBalance(customer.getBalance() - cash);

        printCustomerInfo(customer);

    }

    private void printCustomerInfo(Customer customer) {

        System.out.println("Name: " + customer.getName() +
                "\nLast Name: " + customer.getLastName() +
                "\nage: " + customer.getAge() +
                "\nID: " + customer.getId() +
                "\nBalance: " + customer.getBalance());

    }

}
