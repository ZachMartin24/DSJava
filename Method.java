import java.util.Scanner;

public class Method {

    public static double volume(double radius) {
        double r = radius * radius * radius;
        double answer = r * (4.0 / 3.0) * Math.PI;
        return answer;

    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" What is the radius? ");
        double radius = scanner.nextDouble();
        double sphere = volume(radius);
        System.out.print(" The volume is " + sphere);

    }
}