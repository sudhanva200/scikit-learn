package EXP5;


import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException (String str) {
        super(str);
    }
}

public class myExHan {
    static void validate (int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not Valid!");
        } else {
            System.out.println("Valid");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter age: ");
            int a = sc.nextInt();
            validate(a);
        } catch (InvalidAgeException e) {
            System.out.println("Exception Occured");
        }
    }
}
