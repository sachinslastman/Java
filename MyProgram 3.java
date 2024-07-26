// Name - Sachin Lalka
// Date - September 3, 2021
// PoundConvert

import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner (System.in);
        System.out.println("Please enter an object weight in pounds: ");
        double userPounds = userInput.nextDouble();
        double userKilos = userPounds*0.453592;
        System.out.println(userPounds+" pounds coverts to " +userKilos+ " kilos");
        
        
    }
}