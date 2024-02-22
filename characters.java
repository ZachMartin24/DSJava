import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class characters {

    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("characters.txt");
        Scanner in = new Scanner(inputFile);

        int characters = 0;
        int letters = 0;
        int digits = 0;

        while (in.hasNext()) {
            String line = in.nextLine();

            for (char c : line.toCharArray()) {
                characters++;
                if (Character.isLetter(c)) {
                    letters++;
                } else if (Character.isDigit(c)) {
                    digits++;
                }
                System.out.print(c);
            }
            System.out.println();

        }

        in.close();

        System.out.println("count = " + characters);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);

    }

}