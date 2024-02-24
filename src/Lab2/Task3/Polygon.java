package Lab2.Task3;

public class Polygon {
    Point[] points;

    public Polygon(int n) {
        points = new Point[n];
    }

    public Polygon(float[] coordinates) {
        int n = coordinates.length / 2;
        points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(coordinates[2*i], coordinates[2*i+1]);
        }
    }

    public void displayPolygon() {
        for (Point point : points) {
            point.showCoords();
        }
    }

}
