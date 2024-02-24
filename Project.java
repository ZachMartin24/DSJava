import mow.yard;
import java.util.Scanner;

public class Project {

    public static void clearscreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        clearscreen();

        Scanner in = new Scanner(System.in);

        System.out.print(" What is the height of the yard?: ");
        int height = in.nextInt();

        System.out.print(" What is the width of the yard?: ");
        int width = in.nextInt();

        yard yard = new yard(height, width);

        yard.printyard();

        in.close();

    }

}
