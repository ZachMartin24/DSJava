import java.util.Scanner;

public class Scope2 {
    public static boolean isvowel(char letter) {
        if (letter == 'A' || letter == 'a') {
            return true;
        } else if (letter == 'E' || letter == 'e') {
            return true;
        } else if (letter == 'I' || letter == 'i') {
            return true;
        } else if (letter == 'O' || letter == 'o') {
            return true;
        } else if (letter == 'U' || letter == 'u') {
            return true;
        } else {
            return false;
        } // Read Vowels
    }

    public static int vowel(String phrase) {
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            boolean aeiou = isvowel(phrase.charAt(i));
            if (aeiou == true) {
                count = count + 1;
            }
        } // Add to the number if it is a vowel
        return count;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter any word: ");
        String word = scanner.nextLine();
        int number = vowel(word);
        System.out.print(" The number of vowels is " + number);

    }
}// PRINT