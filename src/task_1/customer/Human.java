package task_1.customer;

import java.util.Scanner;

abstract public class Human {
    private String name;
    private String lastName;
    private int age;


    public Human() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input customer name: ");
        String humanName = scanner.next();
        System.out.println("Input customer last name: ");
        String humanLName = scanner.next();
        System.out.println("Input customer age: ");
        int humanAge = scanner.nextInt();
        this.name = humanName;
        this.lastName = humanLName;
        if (humanAge<=0){
            System.out.println("wrong parameter: ");

        }else {

            this.age = humanAge;
        }
    }


    protected void printInfo() {

        System.out.println("Name: " + name +
                "\nLast Name: " + lastName +
                "\nage: " + age);


    }




}
