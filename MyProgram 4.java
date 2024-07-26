//Sachin Lalka
//Sept 9, 2021
//Playing with data types

import java.util.Scanner; //This allows us to use our keyboard for input

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner keyInput = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int value = keyInput.nextInt();
        System.out.println("The integer is " + value);
        System.out.println("The decimal is " + (double)value);
        System.out.println("Enter a decinal approximation for pi: ");
        double piValue = keyInput.nextDouble();
        System.out.println("The decimal is " + piValue);
        System.out.println("The integer is " + (int)piValue);
        
        System.out.println("Watch this " + 'A'+(char)value);
    }
}