//Sachin Lalka
//January 11th, 2022
//This program gets 10 numbers from the user, and then figures out if they are odd or even, and if they are even they are replaced with a 0, and if they are even, the original number is added to the array


import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int[] numbers = new int [10];
        
        for (int i = 0; i<10; i++) {
            System.out.print("Enter a positive int: ");
            int input = userInput.nextInt();
            if (input%2 == 0)
                numbers[i] = 0;
            else
                numbers[i] = input;
        }
        
        for (int x = 0; x<10; x++) {
            System.out.print(numbers[x]);
            System.out.print(" ");
        }
    }
}