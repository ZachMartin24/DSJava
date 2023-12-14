
// Part A:
// The problem is that input is declared as a String, an then later as an integer
// In order to fix this you would have to make 2 different variables for age and name 
//Part B:
import java.util.Scanner;

public class Scope {
    public static double smallest(double x, double y, double z) {
        if (x < y && x < z) {
            return x;
        } else if (y < x && y < z) {
            return y;
        } else if (z < y && z < x) {
            return x;
        } else if (y == z && y < x) {
            return y;
        } else {
            return x;
        }
        // Making a method to show smallest
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter 3 numbers: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        double smaller = smallest(x, y, z);
        System.out.println(" The smallest number is " + smaller);
        // Excecuting method
    }
}
