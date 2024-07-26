//Sachin Lalka
//December 10th, 2021
//This program takes in a string of ones and zeros, and then figures out if the number of ones are even or odd, thus determining if it has even or odd parity

import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = userInput.nextLine();
        int numOfOnes = 0;
        
        for (int i = 0; i<=(number.length()-1); i++){
            if (number.substring(i,i+1).equals("1"))
                numOfOnes+=1;
        }
        
        if (numOfOnes%2 == 0)
            System.out.println("The string has even parity");
        else
            System.out.println("The string has odd parity");
    }
}