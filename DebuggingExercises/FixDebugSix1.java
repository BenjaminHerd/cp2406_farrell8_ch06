// DebugSix1.java

//Right click on the root folder and mark the folder as sources directory for it to work

// Start with a penny
// double it every day
// how much do you have in a 30-day month?
public class FixDebugSix1
{
   public static void main(String args[])
   {
       //variable declaration
      final int DAYS = 30;
      double money = 0.01;
      int day = 1;

      //while loop that lasts up to 30 days (when day becomes equal to 30 [DAYS])
      while(day < DAYS)
      {
          //Loop action with print statement
         money = 2 * money;
         System.out.println("After day " + day +
            " you have " + money);

         //Loop control variable, so this isn't infinite
         day = day + 1;
      }
   }
}