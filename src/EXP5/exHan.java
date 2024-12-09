package EXP5;

public class exHan {
    public static void main(String[] args) {
        try {
            int a = 50, b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }
    }
}
