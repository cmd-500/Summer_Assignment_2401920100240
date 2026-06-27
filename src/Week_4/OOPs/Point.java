package Week_4.OOPs;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printPoint() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Point p = new Point();
        p.printPoint();
        p.setXY(10, 20);
        p.printPoint();
    }
}