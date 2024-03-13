import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeChecker {
    
    // Default way of checking for palindrome
    public static boolean isPalindrome(String word) {
        ListStack<Character> newWord = new ListStack<>();
        for (int i = 0; i < word.length(); i++) {
            newWord.push(word.charAt(i));
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != newWord.pop()) {
                return false;
            }
        }

        return true;
    }

    // Using Deque
    private static Deque<Character> fillStack(String inputString) {
        Deque<Character> charStack = new ArrayDeque<Character>();
        for (int i = 0; i < inputString.length(); i++) {
            charStack.push(inputString.charAt(i));
        }
        return charStack;
    }

    private static String buildReverse(String inputString) {
        Deque<Character> charStack = fillStack(inputString);
        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            result.append(charStack.pop());

        }
        return result.toString();
    }

    public static boolean isPalindromeWithDeque(String word) {
        String reversedStr = buildReverse(word);
        return word.equals(reversedStr);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Default method
        System.out.print("Enter word: ");
        String str1 = scan.nextLine();
        str1 = str1.toLowerCase();
        System.out.println("Is " + str1 + " a palindrome? " + isPalindrome(str1));

        System.out.println(" ");

        // Using Deque
        System.out.print("Enter word: ");
        String str2 = scan.nextLine();
        str2 = str2.toLowerCase();
        System.out.println("Is " + str2 + " a palindrome? " + isPalindromeWithDeque(str2));

    }
}
