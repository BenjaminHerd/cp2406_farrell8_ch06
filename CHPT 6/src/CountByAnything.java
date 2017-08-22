//import statement for keyboard scanner for user input
import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args) {

        //variable declaration
        final int FINISH = 200;
        final int COUNT_BY_LINE;
        int stepValue;

        //initialises scanner for input
        Scanner input = new Scanner(System.in);

        //Displays message and takes integer entered in command prompt as count by value
        System.out.println("Please enter a number to count by: ");
        stepValue = input.nextInt();

        //This line makes it so each tenth value printed will initiate printing on a new line
        COUNT_BY_LINE = stepValue * 10;

        //for loop checking that it starts at the number entered by the user, finishes once it reaches the FINISH value, and increments the count by the input value to stop the loop
        for(int i = stepValue; i <= FINISH; i += stepValue){
            System.out.print(i + " ");
            if(i % COUNT_BY_LINE ==0)
                System.out.println();
        }
    }
}
