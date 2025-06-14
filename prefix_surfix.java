import java.util.Scanner;

public class prefix_surfix{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the haystack String: ");
        String haystring = scan.nextLine();

        System.out.println("Enter the needle string: ");
        String needle = scan.nextLine();

        char[] array1 = haystring.toCharArray();
        char[] array2 = needle.toCharArray();

        int size1 = haystring.length() - 1;
        int size2 = needle.length() - 1;

        if (array1[0] == array2[0]) {
            System.out.println("It is true");
        } else if (array1[size1] == array2[size2]) {
            System.out.println("It is false");
        } else {
            System.out.println("No match found at beginning or end");
        }

        scan.close();
    }
}
