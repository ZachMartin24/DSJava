import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        double[] values = new double[10];

        int currentSize = 0;

        while (currentSize < values.length) {

            System.out.print(" Enter your test score or 'q' to quit");
            if (scanner.hasNext("q")) {
                break;
            }
            values[currentSize] = scanner.nextDouble();

            currentSize++;

        }

        for (int i = 0; i < currentSize; i++) {
            System.out.println(values[i]);
        }

    }
}
