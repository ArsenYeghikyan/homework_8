package task_3;

public class Main {
    public static void main(String[] args) {
Point point = new Point(0,0);
Point point1 = new Point(5,6);
Point point3 = new Point(5,6);
        System.out.println(point.distance());
        System.out.println(point.distance(3,6));
        System.out.println(point.distance(point1));
    }
}
