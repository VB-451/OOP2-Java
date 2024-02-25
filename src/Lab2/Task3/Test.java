package Lab2.Task3;

public class Test {
    public static void main(String[] args){
        float[] coordinates = {1.0f, 1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Polygon polygon1 = new Polygon(coordinates);
        polygon1.displayPolygon();
        System.out.println("-------------");
        polygon1.points[0].showCoords();
        polygon1.points[0].changeCoords(2.0f, 3.0f);
        polygon1.points[0].showCoords();

    }
}
