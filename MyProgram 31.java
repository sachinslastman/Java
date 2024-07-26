//Sachin Lalka
//January 11th, 2022
//This program gets 10 numbers from the user, and then figures out if they are prime, and if they are, it replaces it with a -1 in the array, and if they aren't, it puts the original number in the array


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
            for (int x = (input-1); x>1; x--) {
                if (x <= 1) {
                    numbers[i] = -1;
                }
                else if (input%x == 0) { 
                    numbers[i] = input;
                }
            }
        }
        for (int y = 0; y<10; y++) {
            System.out.print(numbers[y]);
            System.out.print(" ");
        }
    }
}