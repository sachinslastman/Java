import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a 4 letter word: ");
        String word = userInput.nextLine();
        int randNum = (int)(Math.random()*12+1);
        char letter1 = word.charAt(0);
        char letter2 = word.charAt(1);
        char letter3 = word.charAt(2);
        char letter4 = word.charAt(3);
        int num;
            if (letter1 + randNum > 122) {
                num = (letter1 - 26)+randNum;
                letter1 = (char)num;
            }
            else 
                num = (letter1 + randNum);
                letter1 = (char)num;
                
            
            if (letter2 + randNum > 122) {
                num = (letter2 - 26)+randNum;
                letter2 = (char)num;
            }
            else 
                num = (letter2 + randNum);
                letter2 = (char)num;
                
           
            if (letter3 + randNum > 122) {
                num = (letter3 - 26)+randNum;
                letter3 = (char)num;
            }
            else 
                num = (letter3 + randNum);
                letter3 = (char)num;
                
                
            if (letter4 + randNum > 122) {
                num = (letter4 - 26)+randNum;
                letter4 = (char)num;
            }
            else 
                num = (letter4 + randNum);
                letter4 = (char)num;
        
        System.out.println(""+letter1+letter2+letter3+letter4);
    }
}