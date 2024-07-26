//Sachin Lalka
//October 19th, 2021
//This program gets the user salary, how many years they worked, and if they were a manager or not, and then calcultes there retiremen salary and if they get a retiremnet dinner or not


import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What was your final month salary? ");
        double salary = userInput.nextDouble();
        System.out.println("How many years have you been working? ");
        int years = userInput.nextInt();
        System.out.println("Were you a manager? ");
        char manager = userInput.next().charAt(0);
        double twoThirds = 2.0/3.0;
        
        
        if (years >= 30) {
            System.out.printf("Your salary is $%,.02f%n",(salary*twoThirds));
        }
        
        else if (years >= 20 && years < 30) {
            System.out.printf("Your salary is $%,.02f%n",(salary/2));
        }
        
        else if (years >= 10 && years < 20) {
            System.out.printf("Your salary is $%,.02f%n",(salary/3));
        }
        
        else
            System.out.printf("Your salary is $%,.02f%n",(salary/4));
            
        if (manager == 'Y' && years > 20) {
            System.out.println("Yummy! A dinner!");
        }
        
        else 
            System.out.println("No dinner for me");
        
    }
}