package task_2;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public double calculatePerimeter() {
        return (sideA + sideB + sideC) * 0.5;
    }

    public double calculateArea() {
        double p = calculatePerimeter();
        return Math.sqrt((p * (p - sideA) * (p - sideB) * (p - sideC)));

    }


}
