import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
         Scanner keyboard = new Scanner (System.in);
         System.out.print("Please enter a number between 1-10: ");
         int guess = keyboard.nextInt();
         System.out.println("My number plus 3 is: " + (guess+3));
         System.out.print("Enter a decimal: ");
         double y = keyboard.nextDouble();
         System.out.print("Enter your name: ");
         String name = keyboard.next();
         System.out.println("Your name is: " +name+ " and your decimal is: "+y );
    }
}