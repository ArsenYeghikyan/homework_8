package task_1.customer;

public class VipCustomer extends Customer {


    @Override
    public void updateBalance(double money, Customer customer) {
        customer.setCommissionPercent(0);
        super.updateBalance(money, customer);
    }


}
