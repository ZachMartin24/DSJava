import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Type in a file or '#' to quit: ");
            String filename = in.nextLine();

            if (filename.equals('#')) {
                System.out.println("Goodbye!");
                break;
            }

            try {
                File file = new File(filename);
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNext()) {
                    System.out.println(fileScanner.next());
                }
                fileScanner.close();
            } catch (FileNotFoundException e) {

                System.out.println(" This file does not exist. Try again.");
                continue;
            }

        }

    }

}