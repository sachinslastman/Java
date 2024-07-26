//Sachin Lalka
//December 6th, 2021
//This program gets the number of rows and the start number from the user, and then make a pyramid that is the number of rows high, and starts from the number that the user entered


import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = userInput.nextInt();
        System.out.print("Enter the start number: ");
        int num = userInput.nextInt();
        
        for (int i = 0; i<=rows; i++){
            for(int j = 0; j<i; j++){
                System.out.print(num+" ");
                if (num >= 9)
                    num = 0;
                else
                    num = num + 1;
            }
            System.out.println(" ");
        }
            
    }
}