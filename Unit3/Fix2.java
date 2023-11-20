public class Fix2 {
    public static void main(String[] args) throws Exception {

        // The output originally was "c is not 3.6" because it didnt account for numbers
        // past the thousandths range
        // I created a threshold to make sure the answer would be accurate
        double a = 1.2;
        double b = 3.0;
        double c = a * b;

        double thresh = 1.000001;
        if (c / 3.6 < thresh) {
            System.out.println("c is 3.6");
        } else {
            System.out.println("c is not 3.6");
        }

    }
}