//Sachin Lalka
// November 1st, 2021
// This program gets a string from the user and 2 characters, and then fids where those 2 characters are in the string and figures out which one comes first, and then adds there values togethers, and then finds another character out of the value of the 2 strings

import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a string");
        String userString = userInput.nextLine();
        System.out.println("Enter the first character");
        String character1 = userInput.nextLine();
        System.out.println("Enter the second character");
        String character2 = userInput.nextLine(); 
        char char1 = character1.charAt(0);
        char char2 = character2.charAt(0);
        int char1Pos = (userString.indexOf(char1))+1;
        int char2Pos = (userString.indexOf(char2))+1;
        int stop = 0;
        int yesNo1 = 0;
        int yesNo2 = 0;
        int charValue = (char1Pos) + (char2Pos);
        int length = userString.length();
        char char3 = 'a';
        
        if (userString.indexOf(char1) != -1) {
            yesNo1 = 1;
        }
        if (userString.indexOf(char2) != -1 ) {
            yesNo2 = 1;
        }
        if (yesNo1 == 1 && yesNo2 == 1) {
            System.out.println("The first character '"+char1+"' is at position "+char1Pos);
            
            System.out.println("The second character '"+char2+"' is at position "+char2Pos);
        }
        else {
            stop = 1;
            System.out.println("This program cannot run");
        }
        
        if (char1Pos<char2Pos && stop != 1) 
            System.out.println("'"+char1+"' comes before '"+char2);
        if (char1Pos>char2Pos && stop != 1)
            System.out.println("'"+char1+"' does not comes before '"+char2);
        
        if (stop != 1)
            System.out.println("'"+char1+"' + '"+char2+"' is "+charValue);
        
        
        if (stop != 1)
            System.out.println("The length of the string is "+length);
        
        if (charValue <= length && stop != 1) {
            char3 = userString.charAt(charValue);
            System.out.println("The character at "+charValue+" is '"+char3+"'");
        }
        else if (charValue > length && stop != 1) {
            System.out.println("I cannot output letter number "+charValue+" sense the length is "+length);
        }
    }
}