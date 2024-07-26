//Sachin Lalka
//September 20, 2021
//Program divides 2 fractions that the user inputs

import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the numerator of the first fraction: ");
        double num1 = userInput.nextDouble();
        System.out.println("Please enter the denominator of the first fraction: ");
        double den1 = userInput.nextDouble();
        System.out.println("Please enter the numerator of the second fraction: ");
        double num2 = userInput.nextDouble();
        System.out.println("Please enter the denominator of the first fraction: ");
        double den2 = userInput.nextDouble();
        double fract1 = num1/den1;
        double fract2 = num2/den2;
        double total = fract1*fract2;
        System.out.printf("The total is: %.2f%n",total);
    }
}