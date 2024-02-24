import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class sales {

    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("sales_by_cat.txt");
        Scanner in = new Scanner(inputFile).useDelimiter("[,\\s\\n]+");

        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter("[,\\n\\s ]+");
            String cat = lineScanner.next();
            String name = lineScanner.next();
            double sales;
            if (lineScanner.hasNextDouble()) {
                sales = lineScanner.nextDouble();
            } else {

                lineScanner.next();
                sales = 0.0;

            }

            System.out.printf("%-17s | %-10s | $%10.2f%n", cat, name, sales);

        }

        in.close();

    }

}