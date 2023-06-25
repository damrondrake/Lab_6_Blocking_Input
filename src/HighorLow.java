import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNum = 1+rand.nextInt(10);
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game.");
        System.out.println("Try to guess the secret number between 1 and 10 (inclusive).");
        while(true) {
            try {
                System.out.print("Your guess? ");
                int guess = Integer.parseInt(sc.nextLine());
                if(guess<0 || guess>10) {
                    System.out.print("Out of range, guess again: ");
                    continue;
                }
                if(guess<secretNum) {
                    System.out.println(guess+" is smaller than the secret number");
                }
                else if(guess>secretNum) {
                    System.out.println(guess+" is greater than the secret number");
                }else {
                    System.out.println("You win! You guessed the secret number: "+guess);
                    break;
                }
            }catch(Exception e) {
                System.out.print("Not an integer, guess again: ");
                continue;
            }

        }



        sc.close();
    }
}