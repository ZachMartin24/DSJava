import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            int quiz = getQuizScore(in);
            System.out.println("Score entered: " + quiz);
        } catch (ArithmeticException e) {
            System.out.println("Invalid score. Try Again");

        }
    }

    public static int getQuizScore(Scanner in) {
        System.out.print(" Enter a score from 0 to 100: ");
        int score = in.nextInt();
        if (score < 0 || score > 100) {
            throw new ArithmeticException("Invalid Score.");
        }
        return score;
    }
}
