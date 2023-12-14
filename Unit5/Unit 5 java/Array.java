import java.util.Scanner;

public class Array {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int[] value = new int[5];
        int largest = 0;
        for (int i = 0; i < value.length; i++) {
            System.out.print(" Enter an integer: ");
            value[i] = scanner.nextInt();

            if (value[i] > largest || i == 0) {
                largest = value[i];
            }

        }

        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i]);

            if (value[i] == largest) {
                System.out.print("<= Largest");
            } else {
                System.out.println();
            }

        }
    }
}