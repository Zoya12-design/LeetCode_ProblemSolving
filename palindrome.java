import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int x = scan.nextInt();

        // Call the method and print result
        if (isPalindrome(x)) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }
    }

  
    public static boolean isPalindrome(int x) {
        //  int to String
        String original = Integer.toString(x);

        // Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();

       
        return original.equals(reversed);
    }
}
