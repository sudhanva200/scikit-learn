package EXP1;

import java.util.Scanner;

public class quad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        double b = sc.nextInt();
        System.out.println("Enter the value of c: ");
        double c = sc.nextInt();

        double D = b * b - 4 * a * c;
        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("The roots are %.2f, %.2f", root1, root2);
        } else if (D < 0) {
            double real = -b / (2 * a);
            double imag = -Math.sqrt(Math.abs(D)) / (2 * a);
            System.out.printf("The roots are: (%.2f, %.2fi), (%.2f, %.2fi)", real, imag, real, -imag);
        } else {
            double root1 = -b / (2 * a);
            System.out.printf("The roots are: %.2f, %.2f", root1, root1);
        }
    }
}
