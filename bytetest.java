public class bytetest{
    public static void main(String args[]) {
        byte value = 0;

        for (int i = 0; i < 300; i++) {  // Runs more than 256 times to observe overflow
            value++;  // Incrementing byte value
            System.out.println(value);
        }
    }
}
