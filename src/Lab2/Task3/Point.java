package Lab2.Task3;

public class Point {
    float x;
    float y;
    public Point(float first, float second){
        this.x = first;
        this.y = second;
    }
    public void changeCoords(float changeX, float changeY){
        this.x = changeX;
        this.y = changeY;
    }

    public void showCoords(){
        System.out.println("(" + x + "," + y + ")");
    }
}
