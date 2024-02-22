import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class lowest {

    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("temps.txt");
        Scanner in = new Scanner(inputFile);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int smallest = Integer.MAX_VALUE;

        while (in.hasNext()) {
            int score = in.nextInt();
            list.add(score);
            if (score < smallest) {
                smallest = score;
            }
        }

        for (int i = 0; i < list.size(); i++) {

            System.out.printf("%6d", list.get(i));

            if (list.get(i) == smallest) {

                System.out.print("  <== lowest ");

            }
            System.out.println();

        }

        in.close();
        System.out.close();
    }

}