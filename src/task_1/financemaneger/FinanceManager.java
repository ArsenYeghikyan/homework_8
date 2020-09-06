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


        balanceAfterChanges +=  deposit;

        printCustomerInfo(customer, balanceAfterChanges);

    }

    public void cashOut(double cash, Customer customer) {
        balanceAfterChanges = customer.getBalance();
        if (cash > customer.getBalance()) {
            System.out.println(cash);
            System.out.println(customer.getBalance());
            System.out.println("wrong parameter");
            return;
        }
        balanceAfterChanges -=  cash;
        printCustomerInfo(customer,balanceAfterChanges);

    }

    private void printCustomerInfo(Customer customer, double customerBalance) {

        System.out.println("Name: " + customer.getName() +
                           "\nLast Name: " + customer.getLastName() +
                           "\nage: " + customer.getAge() +
                           "\nID: " + customer.getId() +
                           "\nBalance: " + customerBalance);

    }

}
