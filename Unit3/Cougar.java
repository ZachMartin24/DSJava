
//Zach Martin
//9-26-23
import java.util.Scanner;

public class Cougar {
    public static void main(String[] args) throws Exception {

        Scanner a = new Scanner(System.in);

        System.out.print(" How many pies would you like to buy? ");
        int pies = a.nextInt();

        double price = (10.00 * pies);

        // 10% discount for pies more than 3
        if (pies >= 3) {
            price = (.9 * price);

        } else {
            price = price;
        }

        System.out.println(" Your price is $" + price + "!");
    }
}
