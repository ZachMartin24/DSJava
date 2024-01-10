class DiceRoll {

    private int value;

    public DiceRoll() {
        value = 1;

    }

    public DiceRoll(int newVal) {
        if (newVal < 7 && newVal > 0) {
            value = newVal;
        } else {
            newVal = 1;
        }

    }

    public void roll() {
        double i = Math.random();
        i = i * 6 + 1;

        value = (int) i;
    }

    public void display() {
        if (value == 1) {
            System.out.println(" _______________");
            System.out.println("|               |");
            System.out.println("|               |");
            System.out.println("|               |");
            System.out.println("|       x       |");
            System.out.println("|               |");
            System.out.println("|               |");
            System.out.println("|_______________|");

            System.out.println(" The new value is " + value);
        }
        if (value == 2) {
            System.out.println(" _______________");
            System.out.println("|               |");
            System.out.println("|   x           |");
            System.out.println("|               |");
            System.out.println("|               |");
            System.out.println("|               |");
            System.out.println("|           x   |");
            System.out.println("|_______________|");

            System.out.println(" The new value is " + value);
        }
        if (value == 3) {
            System.out.println(" _______________");
            System.out.println("|               |");
            System.out.println("|   x           |");
            System.out.println("|               |");
            System.out.println("|       x       |");
            System.out.println("|               |");
            System.out.println("|           x   |");
            System.out.println("|_______________|");

            System.out.println(" The new value is " + value);
        }
        if (value == 4) {
            System.out.println(" _______________");
            System.out.println("|               |");
            System.out.println("|   x       x   |");
            System.out.println("|               |");
            System.out.println("|               |");
            System.out.println("|               |");
            System.out.println("|   x       x   |");
            System.out.println("|_______________|");

            System.out.println(" The new value is " + value);
        }
        if (value == 5) {
            System.out.println(" _______________");
            System.out.println("|               |");
            System.out.println("|   x       x   |");
            System.out.println("|               |");
            System.out.println("|       x       |");
            System.out.println("|               |");
            System.out.println("|   x       x   |");
            System.out.println("|_______________|");

            System.out.println(" The new value is " + value);
        }
        if (value == 6) {
            System.out.println(" _______________");
            System.out.println("|               |");
            System.out.println("|   x       x   |");
            System.out.println("|               |");
            System.out.println("|   x       x   |");
            System.out.println("|               |");
            System.out.println("|   x       x   |");
            System.out.println("|_______________|");

            System.out.println(" The new value is " + value);
        }
    }

}

public class Dice {
    public static void main(String[] args) throws Exception {
        DiceRoll randomdice = new DiceRoll(8);
        System.out.println(" The initial value is 1 ");
        System.out.println(" Rolling the die 3 times... ");
        randomdice.roll();
        randomdice.display();
        randomdice.roll();
        randomdice.display();
        randomdice.roll();
        randomdice.display();

    }

}