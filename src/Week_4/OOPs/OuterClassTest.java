package Week_4.OOPs;

class Outer {
    void display() {
        System.out.println("Display from Outer class.");
    }

    class Inner {
        void display() {
            System.out.println("Display from Inner class.");
        }
    }
}

public class OuterClassTest {
    public static void main(String[] args) {
        Outer outerObj = new Outer();
        outerObj.display();

        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.display();
    }
}