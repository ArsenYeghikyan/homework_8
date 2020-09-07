package task_3;

/*
2. Design a class named Point (կետ)
    properties
    - coordinateX
    - coordinateY

    methods
    - distance()  (from 0:0 coordinate)
    - distance(int x, int y)  (from x:y coordinate)
    - distance(Point point) ( Overloaded method to get the distance between 2 points )
 */
public class Point {
    private double coordinateX;
    private double coordinateY;

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double distance() {

        return Math.sqrt(Math.pow((0 - coordinateX), 2) + Math.pow((0 - coordinateY), 2));
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((x - coordinateX), 2) + Math.pow((y - coordinateY), 2));
    }

    public double distance(Point p) {
        Point point1 = new Point(coordinateX, coordinateY);

        return Math.sqrt(Math.pow((point1.coordinateX - p.coordinateX), 2) + Math.pow((point1.coordinateY - p.coordinateY), 2));
    }


}
