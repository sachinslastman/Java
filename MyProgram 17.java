//Sachin Lalka
//November 4th, 2021
//This program takes in 2 words, and then spilts them apart, then spilts the first word apart and puts the second word in the middle of the first\

import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter two words seperated by a space: ");
        String word = userInput.nextLine();
        int space = word.indexOf(" ");
        String word1 = word.substring(0,space);
        int part1Len = word1.length();
        int cut = (part1Len/2);
        String part2 = word.substring(space+1);
        String part1 = word1.substring(0,cut);
        String part3 = word1.substring(cut); 
        System.out.print(part1+part2+part3);
    }
}