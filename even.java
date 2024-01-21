import java.util.Arrays;
import java.util.Random;

public class even {

    public static void main(String[] args) {

        int[] random = new int[10];

        Random number = new Random();

        System.out.print(" Random numbers: ");

        for (int i = 0; i < random.length; i++) {
            random[i] = number.nextInt(10);
            System.out.print(random[i] + " ");
        }

        System.out.println();

        System.out.println(" Elements at an even index: ");
        for (int i = 0; i < random.length; i += 2) {
            System.out.print(random[i] + " ");
        }

        System.out.println();

        System.out.println(" Even numbers: ");
        for (int i = 0; i < random.length; i++) {
            if (i % 2 == 0) {
                System.out.print(random[i] + " ");
            }
        }
        System.out.println();

        System.out.println(" reverse order: ");
        for (int i = random.length - 1; i >= 0; i--) {
            System.out.print(random[i] + " ");

        }
        System.out.println();

        System.out.println(" first and last: ");
        System.out.print(random[0] + " ");
        System.out.print(random[random.length - 1] + " ");

    }

}