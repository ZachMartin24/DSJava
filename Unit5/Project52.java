import java.util.Scanner;

public class Project52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 5-digit zip code: ");
        String zipCode = scanner.nextLine();

        String barcode = getBarCode(zipCode);
        System.out.println("Postal Barcode: " + barcode);

    }

    public static String getBarCode(String zipCode) {
        String result = "|";

        for (int i = 0; i < zipCode.length(); i++) {
            int digit = Integer.valueOf(zipCode.substring(i, i + 1));
            result = result + getEncodedDigit(digit);
        }
        result = result + getEncodedDigit(getCheckDigit(zipCode));
        result = result + " | ";
        return result;
    }

    public static String getEncodedDigit(int number) {

        String result;
        if (number == 1) {
            result = " :::|| ";
        } else if (number == 2) {
            result = " ::|:| ";
        } else if (number == 3) {
            result = " ::||: ";
        } else if (number == 4) {
            result = " :|::| ";
        } else if (number == 5) {
            result = " :|:|: ";
        } else if (number == 6) {
            result = " :||:: ";
        } else if (number == 8) {
            result = " |::|: ";
        } else if (number == 9) {
            result = " |:|:: ";
        } else if (number == 0) {
            result = " ||::: ";
        } else {
            result = "";
        }
        return result;
    }

    public static char getCheckDigit(String zipCode) {

        int sum = 0;

        for (int i = 0; i < zipCode.length(); i++) {
            sum = zipCode.charAt(i);
        }

        int checkDigit = (10 - (sum % 10)) % 10;

        return (char) checkDigit;
    }

}