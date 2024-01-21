import java.util.ArrayList;
import java.util.Scanner;

public class sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (true) {
            System.out.println(" Enter any amount of integers (Q to quit): ");
            if (scanner.hasNext("q") || scanner.hasNext("Q")) {
                scanner.next();
                break;
            } else {
                numbers.add(scanner.nextInt());
            }
        }
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                sum += numbers.get(i);
            } else {
                sum -= numbers.get(i);
            }

        }
        System.out.println(" Sum = " + sum);

    }

}