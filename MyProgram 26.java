//Sachin Lalka
//December 14th, 2021
//This program inputs a string from the user and then figures out how many spaces are in the string

import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a string");
        String line = userInput.nextLine();
        int position = line.indexOf(" ");
        int numOfSpaces = 0;
        while (position>0){
            numOfSpaces++;
            position = line.indexOf("e", position +1);
        }
        System.out.println("There is "+numOfSpaces+" space(s) in that string");
    }
}