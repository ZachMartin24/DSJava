import java.util.Arrays;

public class Test {

    public static void main(String[] args) throws Exception {

        int[] original = { 7, 6, 10, 9, 2 };

        System.out.println(Arrays.toString(original));

        Arrays.sort(original);
        System.out.println(Arrays.toString(original));

    }
}