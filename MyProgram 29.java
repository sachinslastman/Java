//Sachin Lalka
//October 15, 2021
//This program takes in the cost and total people, and then figures out if the bill is eliable gor 


import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the cost of your bill?: ");
        double cost = userInput.nextDouble();
        System.out.println("How many people are there?: ");
        int people = userInput.nextInt();
        
            if (cost < 180 && people <= 6) {
                cost = cost * .9;
                System.out.printf("The coupon has been applied, and the final cost is $%,.02f%n",cost);
            }
            else {
                System.out.println("What time did yor dinner start at?: ");
                double time = userInput.nextDouble();
                
                if (time < 5) {
                    cost = cost * .9;
                    System.out.printf("The coupon has been applied, and the final cost is $%,.02f%n",cost);
                }
                else {
                     System.out.printf("The coupon has not been applied, and the final cost is $%,.02f%n",cost);
                }
            }
    }
}