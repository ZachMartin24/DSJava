
import java.util.Scanner;

class Counter {
    private int count;

    public int getValue() {
        return count;
    }

    public void count() {
        count += 1;
        if (count > 9999) {
            reset();
        }
    }

    public void reset() {
        count = 0;
    }
}

public class cake {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Counter cakeCounter = new Counter();
        Counter pieCounter = new Counter();

        System.out.print("Enter 'c' for cake, 'p' for pie, or 'q' to quit: ");

        char choice;
        do {

            choice = in.nextLine().charAt(0);
            switch (choice) {
                case 'c':
                    cakeCounter.count();
                    break;
                case 'p':
                    pieCounter.count();
                    break;
                case 'q':
                    break;
                default:
                    System.out.println(" Invalid input. ");
            }
        } while (choice != 'q');

        System.out.println(" Total count for cake: " + cakeCounter.getValue());
        System.out.println(" Total count for pie: " + pieCounter.getValue());

    }

}
