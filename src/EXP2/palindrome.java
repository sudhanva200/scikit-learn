package EXP2;

public class palindrome {
    public static void main(String[] args) {
        String word = "Racecar";

        if (isPalindrome(word)) {
            System.out.println("The word: " + word + " is a palindrome");
        } else {
            System.out.println("The word: " + word + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
