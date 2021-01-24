import java.util.Random;
import java.util.Scanner;

public class ScriptOne {
    public static void main(String[] args) {
        boolean c = true;
        int number = generateRandom();
        while (c == true) {
            int guess = input();
            if (guess == number) {
                System.out.println("correct");
                c = false;
            } else if (guess < number) {
                System.out.println("higher");
            } else if (guess > number) {
                System.out.println("lower");
            }
        }
    }

    public static int generateRandom() {
        Random rand = new Random();
        int randint = rand.nextInt(100);
        return randint;
    }

    public static int input() {
        Scanner inputOb = new Scanner(System.in);
        System.out.println("what is your guess? ");

        int guess = inputOb.nextInt();
        return guess;

    }
}
