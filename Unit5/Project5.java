import java.util.Scanner;

public class Project5 {
    public static int leadingNumber(String section) {
        int dotIndex = section.indexOf('.');
        String leadingStr = section.substring(0, dotIndex);
        int leadingNumber = 0;
        for (int i = 0; i < leadingStr.length(); i++) {
            leadingNumber = leadingNumber * 10 + (leadingStr.charAt(i) - '0');
        }

        return leadingNumber;
    }

    public static String truncateSection(String section) {
        int dotIndex = section.indexOf('.');
        int startIndex = dotIndex + 1;

        if (startIndex < section.length()) {
            return section.substring(startIndex);
        } else {
            return "";
        }
    }

    public static String TruncatedSections(String section1, String section2) {
        String truncatedSection1 = truncateSection(section1);
        String truncatedSection2 = truncateSection(section2);

        if (truncatedSection1.compareTo(truncatedSection2) < 0) {
            return section1;
        } else {
            return section2;
        }
    }

    public static String whoIsFirst(String section1, String section2) {
        if (leadingNumber(section1) < leadingNumber(section2)) {
            return section1;
        } else if (leadingNumber(section1) > leadingNumber(section2)) {
            return section2;
        } else {
            return TruncatedSections(section1, section2);

        }
    }

    public static void main(String[] args) {

        System.out.println(whoIsFirst("1.13.2", "1.2.4.1"));
        System.out.println(whoIsFirst("1.3", "1.3.1"));
        System.out.println(whoIsFirst("1.2.3", "1.2.3"));
    }
}
