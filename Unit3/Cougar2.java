import java.util.Scanner;

public class Cougar2 {
    public static void main(String[] args) {
        final double COOKIE_PRICE = 0.99;
        final double DISCOUNT_6 = 0.025;
        final double DISCOUNT_12 = 0.05;
        final double DISCOUNT_24 = 0.15;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cookies you want to purchase: ");
        int quantity = scanner.nextInt();

        double totalCost = quantity * COOKIE_PRICE;

        if (quantity > 6) {
            totalCost -= totalCost * DISCOUNT_6;
        }

        if (quantity > 12) {
            totalCost -= totalCost * DISCOUNT_12;
        }

        if (quantity > 24) {
            totalCost -= totalCost * DISCOUNT_24;
        }

        System.out.printf("Total cost for %d cookies: $%.2f%n", quantity, totalCost);
    }

}
