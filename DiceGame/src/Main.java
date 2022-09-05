
import java.util.Scanner; //scans for input

import java.util.Random; //randomizes the number selected

//Dice Game allows uses to enter how many dice and the code displays a random number between 1-6 with total
public class Main { 
    public static void main(String args[])
    {
        System.out.print("Enter the number of dice your rolling: "); //asks input for how many dice to use

        Scanner input = new Scanner(System.in);
        int numberOfDice = input.nextInt();

        Random ranNum = new Random(); //populates a random number

        System.out.print("Hey Player! You rolled: "); //displays the random number between 1-6
        int total = 0;
        int randomNumber = 0;

        for (int i = 0; i < numberOfDice; i++) {

            randomNumber = ranNum.nextInt(6) + 1;
            total = total + randomNumber;
            System.out.print(randomNumber);
            System.out.print(" ");
        }

        System.out.println("");
        System.out.println("Total amount on dice: " + total); //adds the total number of randomizes number from dice
        System.out.println("Thanks for playing"); //ends game
        input.close();
        
    }//end of program
}
