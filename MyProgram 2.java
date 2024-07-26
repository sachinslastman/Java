// Name: Sachin Lalka
// Date: September 3, 2021
// AverageCalc


import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner (System.in);
        System.out.print("Please enter a number: ");
        double number1 = userInput.nextDouble();
        System.out.print("Please enter a number: ");
        double number2 = userInput.nextDouble();
        System.out.print("Please enter a number: ");
        double number3 = userInput.nextDouble();
        System.out.print("Please enter a number: ");
        double number4 = userInput.nextDouble();
        System.out.print("Please enter a number: ");
        double number5 = userInput.nextDouble();
        double totalNumbers = number1 + number2 + number3 + number4 + number5;
        double roundedNumbers = totalNumbers / 5;
        System.out.println("You entered the numbers: " +number1+ " , " +number2+ " , " +number3+ " , " +number4+ " , " +number5 );
        System.out.println("The average of those numbers is: " +roundedNumbers);
        
        
    }
}