// Heran Kassaye
import java.util.Scanner;
public class RandomNumberGuesser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randNum = RNG.rand();
        int upperBound = 99;
        int lowerBound = 0;
        int guessCount = 0;
        System.out.println("Enter your first guess between 0 and 100");
        int userGuess = sc.nextInt();
        String cont = "yes";

        do {
            if (userGuess > randNum) {
                upperBound = userGuess;
                System.out.println("Number of guess is: " + RNG.getCount());
                System.out.println("Your guess is to high");
                System.out.println("Enter your next guess between " + lowerBound + " " + upperBound);
                userGuess = sc.nextInt();
                while (!RNG.inputValidation(userGuess, lowerBound, upperBound)) {
                    RNG.inputValidation(userGuess, lowerBound, upperBound);
                    userGuess = sc.nextInt();
                }

            } else if (userGuess < randNum){
                lowerBound = userGuess;
                RNG.inputValidation(randNum, lowerBound, upperBound);
                System.out.println("Number of guess is: " + RNG.getCount());
                System.out.println("Your guess is too low");
                System.out.println("Enter your next guess between " + lowerBound + " " + upperBound);
                userGuess = sc.nextInt();
                while (!RNG.inputValidation(userGuess, lowerBound, upperBound)) {
                    RNG.inputValidation(userGuess, lowerBound, upperBound);
                    userGuess = sc.nextInt();
                }

            } else if( (userGuess == randNum) ) {
                System.out.println("congratulations you guessed correctly");
                RNG.resetCount();
                userGuess = RNG.rand();
                System.out.println("Try again? (yes or no)");
                cont = sc.next();
                upperBound = 99;
                lowerBound = 0;
            }

        } while (cont.equals("yes"));
        System.out.println("Thank you for playing...");
    }
}

