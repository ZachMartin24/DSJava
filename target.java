import java.util.Arrays;
import java.util.Scanner;

public class target {

    public static void main(String[] args) {

        int[] array = new int[20];
        int currentSize = 0;
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter an integer value or 'q' to quit: ");

        while (in.hasNextInt() && currentSize < array.length) {
            array[currentSize] = in.nextInt();
            currentSize++;

            System.out.printf("Enter an integer value or 'q' to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                break;
            }

        }

        for (int i = 0; i < currentSize; i++) {
            System.out.print(array[i]);
            System.out.println();

        }

        System.out.println(" Enter a target value ");
        int target = in.nextInt();
        int values = 0;

        for (int i = 1; i < currentSize; i++) {
            if (array[i] == target) {
                values++;
            }

        }

        System.out.println();

        System.out.println(" The number of target values is " + values);
    }

}
