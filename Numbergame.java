import java.util.Scanner;
import java.util.Random;

public class Numbergame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int gameagain = 1;
        int totalscore = 0;

        while (gameagain == 1) {
            int number = random.nextInt(100) + 1; 
            int a = 0;
            int b = 0;
            int max = 5;

            System.out.println("\nI have chose a number between 1 and 100.");
            System.out.println("You have " + max + " tries to guess it");

            while (a != number && b < max) {
                System.out.print("Enter your guess: ");
                a = sc.nextInt();
                b++;

                if (a == number) {
                    System.out.println("Correct! You guessed it in " + b + " tries.");
                    totalscore += (max - b + 1); // higher score for less tries
                    break;
                } else if (a < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                if (b == max && a != number) {
                    System.out.println("Sorry, you're out of maximum tries. The number was: " + number);
                }
            }

            System.out.print("Do you want to play again? (1 for yes / 0 for no): ");
            gameagain = sc.nextInt();
        }

        System.out.println("\nGame Over! Your total score is: " + totalscore);
        sc.close();
    }
}