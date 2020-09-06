package task_1.custumer;

import java.util.Scanner;

abstract public class Human {
    private String name;
    private String lastName;
    private int age;

    public Human() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input customer name: ");
        String customerName = scanner.next();
        System.out.println("Input customer last name: ");
        String customerLName = scanner.next();
        System.out.println("Input customer age: ");
        int customerAge = scanner.nextInt();
        this.name = customerName;
        this.lastName = customerLName;
        this.age = customerAge;
    }

     public String getName() {
         return name;
     }

     public String getLastName() {
         return lastName;
     }

     public int getAge() {
         return age;
     }






}
