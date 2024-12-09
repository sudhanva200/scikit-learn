package EXP3;

interface printable {
    void print();
}

interface showable {
    void show();
}

public class MI implements printable, showable{

    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        MI obj = new MI();
        obj.print();
        obj.show();
    }
}
