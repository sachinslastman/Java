// Sachin Lalka
// September 13, 2021
// TrapizoidArea


import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner (System.in);
        System.out.println("Please enter the bottom base length in centimeters: ");
        double base1 = userInput.nextDouble();
        System.out.println("Please enter the top base length in centimeters: ");
        double base2 = userInput.nextDouble();
        System.out.println("Please enter the height of the trapizoid in centimeters: ");
        double height = userInput.nextDouble();
        double trapBase = base1 + base2;
        double trapArea = .5 * trapBase * height;
        System.out.println("The area is: "+trapArea+" centimeters");



    }
}