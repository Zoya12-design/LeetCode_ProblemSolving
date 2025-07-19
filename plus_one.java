public class Stack {
    public static int[] plusone(int[] array){
        int n = array.length;

        // Right to left loop chalayenge
        for (int i = n - 1; i >= 0; i--) {
            if (array[i] < 9) {
                array[i]++;      // Digit me 1 add karo
                return array;    // Done, return result
            }
            array[i] = 0;        // Agar 9 hai to usse 0 banao aur carry left me bhejo
        }

        // Agar sabhi digits 9 the
        int[] newArray = new int[n + 1];
        newArray[0] = 1; // Baaki by default 0 hote hain
        return newArray;
    }

    public static void main(String args[]) {
        int array[] = {8, 7, 1, 4, 3, 9};

        System.out.print("Before: ");
        for (int i = 0 ; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // Function call and store returned updated array
        int[] result = plusone(array);

        System.out.print("After:  ");
        for (int i = 0 ; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
