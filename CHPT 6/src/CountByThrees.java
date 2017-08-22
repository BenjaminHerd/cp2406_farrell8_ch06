public class CountByThrees {
    public static void main(String[] args) {

        //variable declaration
        final int MAX = 300;
        final int MIN = 3;
        final int NO_PER_LINE = 30;

        //for loop (since there is a definite stopping point defined
        for(int i = MIN; i <= MAX; i += MIN){
            System.out.print(i + " ");

            //If a number divides evenly by 30, print numbers on a new line
            if(i % NO_PER_LINE == 0)
                System.out.println();
        }



    }
}
