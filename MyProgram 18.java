//Sachin Lalka
//October 13, 2021
//The program asks the user for a pizza size and amount of toppings and then outputs price of pizza



import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the size of the pizza (12, 14, or 16 inch): ");
        int pizzaSize = userInput.nextInt();
        System.out.println("Please enter the amount of toppings you would like: ");
        int toppings = userInput.nextInt();
        double price = 0;
        
            if (pizzaSize == 12) {
                price = 9;
            }
            else if (pizzaSize == 14) {
                price = 11;
            }
            else 
                price = 14;
            
            
            if (toppings == 0) {
                price = price;
            }
            else if (toppings == 1) {
                price = price + 2;
            }
            else if (toppings == 2) {
                price = price + 3;
            }
            else if (toppings >= 3) {
                price = price + (3.5 + (0.5*(toppings-3)));
            }
        System.out.printf("The price of the pizza is $%,.2f%n",price);
    }
}