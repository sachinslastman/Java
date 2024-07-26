//Sachin Lalka
//September 24, 2021
//QuadraticFormula


import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the value for a (cannot be equal to 0): ");
        double a = userInput.nextDouble();
        System.out.println("Please enter the value for b: ");
        double b = userInput.nextDouble();
        System.out.println("Please enter the value for c: ");
        double c = userInput.nextDouble();
        double pos = -b + Math.sqrt(Math.pow(b,2)-4*a*c);
        double neg = -b - Math.sqrt(Math.pow(b,2)-4*a*c);
        double posFinal = (pos)/(2*a);
        double negFinal = (neg)/(2*a);
        System.out.printf("The equation "+a+"x^2 + "+b+"x + "+c+" has the roots " +"%,.2f%n", posFinal);
        System.out.printf("and "+"%,.2f%n", negFinal);
    }
 }