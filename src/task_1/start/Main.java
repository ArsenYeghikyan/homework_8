package task_1.start;

import task_1.customer.Customer;
import task_1.customer.VipCustomer;


public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.updateBalance(1000,customer);
        customer.updateBalance(5000,customer);

        Customer vipCustomer = new VipCustomer();

        vipCustomer.updateBalance(200, vipCustomer);
        vipCustomer.updateBalance(3000, vipCustomer);


    }
}
