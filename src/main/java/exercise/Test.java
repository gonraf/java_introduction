package exercise;

public class Test {

    public static void main(String[] args) {
        Point point1 = new Point(3.0D, 1.0D);
        Point point2 = new Point (4.0D, 7.0D);

        double distance = Point.distance(point1, point2);
        System.out.println(distance);

        distance = point1. distance(point2);
        System.out.println(distance);

        distance = point2. distance(point1);
        System.out.println(distance);

    }
}
