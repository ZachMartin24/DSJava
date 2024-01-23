import java.util.Arrays;
import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        int[] reverse = new int[10];
        int currentSize = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter values, Q to quit:");
        while (in.hasNextInt() && currentSize < reverse.length) {
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                break;
            }
            reverse[currentSize] = in.nextInt();
            currentSize++;

        }
        System.out.print("*");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(reverse[i] + "*");
        }
        System.out.println();
        Arrays.sort(reverse, 0, currentSize);
        for (int i = currentSize - 1; i >= 0; i--) {
            System.out.print(reverse[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
