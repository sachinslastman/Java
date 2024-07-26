//Sachin Lalka
//Sept 28, 2021
//The program calculates a certain amount of population after a certain amount of by a certain percentage, then prints the output, and the does the same for the decay rate



import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner (System.in);
        System.out.println("Please enter the current population: ");
        int population = userInput.nextInt();
        System.out.println("Please enter the years to calculate: ");
        int years = userInput.nextInt();
        System.out.println("Please enter the growth rate: ");
        double growth = userInput.nextDouble();
        double growthPercent = 1 + (growth/100);
        double pos = population * Math.pow(growthPercent, years);
        double roundedPos = (Math.rint(pos));
        
        System.out.print("In " +years+ " years at a growth rate of "+growth+"%, the population is expected to be ");
        System.out.printf("%.0f%n",roundedPos);
        
        System.out.println("Please enter the current population: ");
        int population2 = userInput.nextInt();
        System.out.println("Please enter the years to calculate: ");
        int years2 = userInput.nextInt();
        System.out.println("Please enter the decay rate: ");
        double decay2 = userInput.nextDouble();
        double decayPercent = 1 - (decay2/100);
        double neg = population2 * Math.pow(decayPercent, years2);
        double roundedNeg = (Math.rint(neg));
        
        System.out.print("In " +years2+ " years at a decay rate of "+decay2+"%, the population is expected to be ");
        System.out.printf("%.0f%n",roundedNeg);
        
    }
}