import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PracticalProblem {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("billionaires.txt");
        Scanner in = new Scanner(inputFile);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            // String nextWord = lineScanner.next().trim();
            lineScanner.useDelimiter("[;\\n]+");
            String name = lineScanner.next().trim();
            String nextWord = lineScanner.next().trim();
            nextWord = nextWord.replaceAll(",", "");
            nextWord = nextWord.replaceAll("\\$", "");
            double netWorth = Double.valueOf(nextWord);
            // nextWord = lineScanner.next().trim();
            String country = lineScanner.next().trim();

            double taxedValue = (netWorth * .03);

            System.out.printf(" %-20s: $%,14.2f | $%,14.2f | %-15s%n", name, netWorth, taxedValue, country);

        }
        in.close();

    }
}
