import java.util.Scanner;

public class Fix {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // are they lucky?
        // Have to use double == so that it is not initializing the variable
        if (age == 13) {
            System.out.println("Lucky 13!");
        }

    }

}