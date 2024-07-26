//Sachin Lalka
//October 6, 2021
//MovieTicket


import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = userInput.nextInt();
        System.out.println("Would you like a small popcorn (1), a large popcorn (2), or no popcorn (3)?");
        int popcorn = userInput.nextInt();
        double price = 0.00;
            if (age < 18) {
                price = 6.50;
            }
            else if (age >= 65) {
                price = 6.00;
            }
            else
                price = 7.50;
        
            if (popcorn == 1) {
                price = price + 3.50;
            }
            else if (popcorn == 2) {
                price = price + 4.50;
            }
            else
                price = price;
                
        System.out.print("The cost of your movie ticket is $");
        System.out.printf("%.2f%n", price);
    }
}