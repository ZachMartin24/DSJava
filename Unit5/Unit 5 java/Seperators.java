public class Seperators {
    public static void main(String[] args) throws Exception {

        double[] values = { 100.0, 98.0, 87.5 };
        for (int i = 0; i < values.length; i++) {
            if (i > 0) {
                System.out.print(" | ");
            }

            System.out.print(values[i]);
        }

    }
}
