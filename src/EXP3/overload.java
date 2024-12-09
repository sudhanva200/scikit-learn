package EXP3;

class calVal {

    void calValue() {
        int x = 20;
        x = x * x;
        System.out.println("Square of x: " + x);
    }

    void calValue(int y) {
        y = y * y * y;
        System.out.println("Square of y: " + y);
    }

    void calValue(int m, int n) {
        int z = m * n;
        System.out.println("Square of z: " + z);
    }
}

public class overload {
    public static void main(String[] args) {
        calVal n = new calVal();
        n.calValue();
        n.calValue(10);
        n.calValue(10, 20);
    }
}
