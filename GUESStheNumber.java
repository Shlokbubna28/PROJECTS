import java.util.*;
public class MiniProject
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // MINI PROJECT :

        // WE WILL GENERATE A RANDOM NUMBER
        // WE WILL ASK THE USER TO GUESS IT
        // IF THE GUESSED NUMBER IS SMALLER THAN THE RANDOM NO. THEN WE WILL TELL THE USER THAT THE NO. IS BIGGER THAN WHAT THEY HAVE GUESSED
        // IF THE GUESSED NUMBER IS BIGGER THAN THE RANDOM NO. THEN WE WILL TELL THE USER THAT THE NO. IS SMALLER THAN WHAT THEY HAVE GUESSED
        // PROGRAM RUNS TILL THE USER GUESSES THE CORRECT NUMBER OR THE USER STOPS THE GAME ONLY
        // NO. TO BE GENERATED ONLY BETWEEN 1-100
        // IF THE USER TYPES -1 THEN THE PROGRAM STOPS AND WE PRINT THE CORRECT NUMBER TO SHOW THE USER



        System.out.println("RULES : ");
        System.out.println("Guess a number between 1-100 ");
        System.out.println("To exit the game enter -1 ");
        System.out.println();

        // System.out.println("The random no. between 1 - 100 is : ");
        int mn = (int)(Math.random()*100);
        int gn =0;

        do {

            System.out.println("Guess the number : ");
            gn = sc.nextInt();

            if(gn == mn)
            {
                System.out.println("U HAVE GUESSED THE RIGHT NUMBER : "+gn);
                break;
            }
            else if(gn > mn)
            {
                System.out.println("The number is smaller than guessed ");
            }
            else if(gn == -1)
            {
                System.out.println("THE NUMBER WAS : " +mn);
            }
            else if(gn < mn)
            {
                System.out.println("The number is bigger than guessed ");
            }


        }while(gn >= 0);


    }
}
