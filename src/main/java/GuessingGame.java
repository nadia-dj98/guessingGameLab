import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        //user input -> ask question Guess my number
        //user inputs number
        //if else statement -> if number == myNum print You guessed correct!
        // else if -> too high
        //else -> too low

        //variable with my age
        byte myNum = 24;

        //prompt
        System.out.println("How old do you think I am?");

        //user input
        Scanner reader= new Scanner (System.in);
        String guess = reader.nextLine();
        int usersGuess = Integer.parseInt(guess);



        //if else statement
        if(usersGuess == myNum){
            System.out.println("You guessed correct! Well done!");
        }
        else if(usersGuess > myNum ) {
            System.out.println("You guessed too high :(");
        }
        else{
            System.out.println("You guessed too low :(");
        }

    }
}
