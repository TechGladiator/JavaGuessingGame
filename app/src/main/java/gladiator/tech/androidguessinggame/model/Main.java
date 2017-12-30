package gladiator.tech.androidguessinggame.model;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(100) + 1;

        System.out.printf("Welcome to the game!%n%nPlease enter a number between 1 and 100%n%n");

        int tries = 5;

        while (tries > 0) {
            Scanner scanner = new Scanner(System.in);

            int guess = scanner.nextInt();

            tries -= 1;
            if (guess == number) {
                System.out.printf("You guessed correctly!%n%n");
                break;
            } else if (guess < number) {
                System.out.printf("Your guess was too low. Please try again. You have %d tries left.%n%n", tries);
            } else {
                System.out.printf("Your guess was too high. Please try again. You have %d tries left.%n%n", tries);
            }
        }

        System.out.printf("The number was %d.", number);
    }
}
