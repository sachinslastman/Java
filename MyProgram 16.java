//Sachin Lalka
//November 10th, 2021
//This programs translates a word that the user enters into pig latin using the various changes based on where a vowel is placed in the word

import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String userWord = userInput.nextLine();
        String word = userWord.toLowerCase();
        char firstLetter = word.charAt(0);
        char secondLetter = word.charAt(1);
        char thirdLetter = word.charAt(2);
        String part1 = "";
        String part2 = "";

        if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u' || firstLetter == 'y') {
            System.out.println(word+"yay"); 
        }
        
        else if (firstLetter != 'a' && firstLetter != 'e' && firstLetter != 'i' && firstLetter != 'o' && firstLetter != 'u' && firstLetter != 'y' && secondLetter == 'a' || secondLetter == 'e' || secondLetter == 'i' || secondLetter == 'o' || secondLetter == 'u' || secondLetter == 'y') {
            part1 = word.substring(1);
            part2 = word.substring(0,1);
            System.out.println(part1+part2+"ay");
        }
        
        else if (firstLetter != 'a' && firstLetter != 'e' && firstLetter != 'i' && firstLetter != 'o' && firstLetter != 'u' && firstLetter != 'y' && secondLetter != 'a' && secondLetter != 'e' && secondLetter != 'i' && secondLetter != 'o' && secondLetter != 'u' && secondLetter != 'y' && thirdLetter != 'a' && thirdLetter != 'e' && thirdLetter != 'i' && thirdLetter != 'o' && thirdLetter != 'u' && thirdLetter != 'y') { 
            part1 = word.substring(3);
            part2 = word.substring(0,3);
            System.out.println(part1+part2+"ay");
        }
        
        else if (firstLetter != 'a' && firstLetter != 'e' && firstLetter != 'i' && firstLetter != 'o' && firstLetter != 'u' && firstLetter != 'y' && secondLetter != 'a' && secondLetter != 'e' && secondLetter != 'i' || secondLetter != 'o' && secondLetter != 'u' && secondLetter != 'y') {
            part1 = word.substring(2);
            part2 = word.substring(0,2);
            System.out.println(part1+part2+"ay");
        }
    }
}