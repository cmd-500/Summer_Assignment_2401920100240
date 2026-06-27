package Week_4.OOPs;

class Box {
    double length;
    double breadth;

    Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }
}

class Box3d extends Box {
    double height;

    Box3d(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    double getVolume() {
        return getArea() * height;
    }
}

public class BoxTest {
    public static void main(String[] args) {
        Box3d myBox = new Box3d(5.0, 4.0, 3.0);

        System.out.println("Base Area of the box: " + myBox.getArea());
        System.out.println("Volume of the 3D box: " + myBox.getVolume());
    }
}