import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Birth {

    public static void main(String[] args) {
        try {
            File inputFile = new File("birthyears.txt");
            Scanner in = new Scanner(inputFile);

            while (in.hasNext()) {
                String line = in.nextLine();
                int space = line.indexOf(',');
                String name = line.substring(0, space);
                String birthyear = line.substring(space + 1);

                try {
                    if (birthyear != "n/a") {
                        int year = Integer.parseInt(birthyear);
                        System.out.println(name + " was born in " + year + ".");
                    } else if (birthyear != "n/a") {
                        System.out.println(" I do not know what year " + name + " was born");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Can't find the year for " + name);

                }
            }
        }

        catch (FileNotFoundException e) {
            System.out.println(" File not Found");
        }
    }

}
