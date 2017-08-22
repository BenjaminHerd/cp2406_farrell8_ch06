//import scanner statement
import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {

        //variable declaration
        int user_input;
        final int SENTINEL = 999;

        //Initialises scanner function
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an even number: ");
        user_input = input.nextInt();

        //while the user's input isn't the quit value, perform this
        while(user_input != SENTINEL){

            //If user_input is an even number
            if((user_input % 2) == 0){
                System.out.println("Good job!");
                System.out.println("Please enter another even number: ");
                user_input = input.nextInt();
            }
            //If user_input is an odd number
            else{
                System.out.println("Error!  Please enter an even number: ");
                user_input = input.nextInt();
            }

        }

    }
}
