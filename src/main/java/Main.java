import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        int guessNumber = 2;
        int userNumber = 0;
        int numberGuesses = 0;
        Scanner scanner = new Scanner(System.in);
        while (guessNumber != userNumber) {

            System.out.println("Enter a number between 1 and 10");
            userNumber = scanner.nextInt();

            if (userNumber > guessNumber) {
                System.out.println(userNumber + " is too large.");
            }
            else if (userNumber < guessNumber) {
                System.out.println(userNumber + " is too small.");
            }
            else if (userNumber == guessNumber) {
                System.out.println("You guessed correctly!");
            }
            numberGuesses++;

        }
        System.out.println("You guessed " + numberGuesses + " times.");
        scanner.close();
    }
}
