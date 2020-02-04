package classes.basics.exercise;

public class PointCollection {
    
    Point[] points = new Point[100];
    int pointNumber = 0;
    
    void addPoints(Point...points) {
        for (Point newPoint: points) {
            this.points[pointNumber] = newPoint;
            pointNumber++;
        }
    }

    void printStats() {
        //wypisz najmniejszy, największy dystans między punktami
        // tip - wskazówka: nie porównuj punktu samego z sobą (if (point1 !=point2))
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
    }
    
    void printAllPoints() {
        // wypisz wszystkie elementy tablicy this.points od 0 do (this.pointNumber - 1)
        for (int i=0; i < pointNumber;i++) {
            printPoint(points[i]);
        }
    }
    
    void printPoint(Point point) {
        System.out.println("Point(x: " + point.getX() + ", y: " + point.getY() + ")");
    }
}
