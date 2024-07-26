//Sachin Lalka
//December 10th, 2021
//This program takes in a string and then prints the string out in reverse


import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String myString =  userInput.nextLine();
        myString = myString.toLowerCase();
        String output = "";
        
        for (int i = (myString.length()-1); i>=0; i--) {
           
            if (myString.substring(i,i+1).equals(" "))      
                output+= "&";
            
            if (myString.substring(i,i+1).equals("a") || myString.substring(i,i+1).equals("e") || myString.substring(i,i+1).equals("i") || myString.substring(i,i+1).equals("o") || myString.substring(i,i+1).equals("u")) 
                output = output;
            
            else    
                output+= myString.substring(i,i+1);
            
        }
        output = output.replace(" ",""); 
        System.out.print(output);
    }
}