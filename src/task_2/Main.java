package task_2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 4, 2);
        double p = triangle.calculatePerimeter();
        double a = triangle.calculateArea();
        System.out.println(p);
        System.out.println(a);
    }
}
