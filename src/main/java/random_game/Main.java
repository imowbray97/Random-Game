package random_game;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random selctor = new Random();
        Scanner prompt = new Scanner(System.in);
        System.out.println("Guess an number between 1-10");
        int guess = prompt.nextInt();
        int finalGuess = guess;
        int luckNum = selctor.nextInt(10);
        int finalLuckNum = luckNum;
        System.out.println(finalLuckNum);
        for (int i = 1; true; i++) {

            if (guess < finalLuckNum) {
                System.out.println("You guessed: " + guess + "\n" + "too small");
                guess = prompt.nextInt();
                continue;

            } else if (guess == finalLuckNum) {
                System.out.println("You guessed: " + guess + "\n" + "This is correct lucky number which is " + finalLuckNum);
                System.out.println("number of chances: " + i);
                break;
            } else {
                System.out.println("You guessed: " + guess + "\n" + "too big");
                guess = prompt.nextInt();
                continue;
            }
        }

    }
}
