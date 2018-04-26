package random_game;
import java.util.Random;
import java.util.Scanner;
public class NumberGeneraters {
    Random selctor = new Random();
    Scanner prompt = new Scanner(System.in);

    public NumberGeneraters(Random selctor, Scanner prompt) {
        this.selctor = selctor;
        this.prompt = prompt;
    }

    public Random getSelctor() {
        return selctor;
    }

    public void setSelctor(Random selctor) {
        this.selctor = selctor;
    }

    public Scanner getPrompt() {
        return prompt;
    }

    public void setPrompt(Scanner prompt) {
        this.prompt = prompt;
    }

    public int luckNum(){
        return selctor.nextInt(10);
    }

    public int guess(){
        return  prompt.nextInt();
    }

    public void findWinner() {
        for (int i = guess(); i <= 10; i++) {
            if (guess() < luckNum()) {
                System.out.println("You guessed: " + guess() + "\n" + "too small");
            } else if (guess() > luckNum()) {
                System.out.println("You guessed: " + guess() + "\n" + "too big");
            } else {
                System.out.println("You guessed: " + guess() + "\n" + "This is correct");
            }
        }
    }

    @Override
    public String toString() {
        return "NumberGeneraters{" +
                "selctor=" + selctor +
                ", prompt=" + prompt +
                '}';
    }
}
