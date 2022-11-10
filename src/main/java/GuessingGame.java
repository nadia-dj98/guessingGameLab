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
        byte usersGuess = 0;
        //prompt
        System.out.println("How old do you think I am?");

        //user input
        Scanner user= new Scanner (System.in);
        usersGuess = user.nextByte();



        //if else statement
        if(usersGuess == 24){
            System.out.println("You guessed correct! Well done!");
        }
        else if(usersGuess > 24 ) {
            System.out.println("You guessed too high :(");
        }
        else{
            System.out.println("You guessed too low :(");
        }

    }
}
