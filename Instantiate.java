import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Instantiate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("The name you have entered is: " + name);

        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.print("The age you have entered is: " + age);
    }

}
