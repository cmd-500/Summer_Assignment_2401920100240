package Week_4.OOPs;

interface test {
    int square(int n);
}

class arithmetic implements test {
    @Override
    public int square(int n) {
        return n * n;
    }
}

public class ToTestInt {
    public static void main(String[] args) {
        arithmetic mathObj = new arithmetic();
        int result = mathObj.square(5);
        System.out.println("The square of 5 is: " + result);
    }
}