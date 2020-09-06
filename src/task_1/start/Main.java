package task_1.start;

import task_1.custumer.Customer;
import task_1.financemaneger.FinanceManager;

public class Main {
    public static void main(String[] args) {
        FinanceManager financeManager = new FinanceManager();
        Customer customer = new Customer();

        financeManager.cashIn(150,customer);
        financeManager.cashOut(15,customer);

    }
}
