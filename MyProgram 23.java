//Sachin Lalka
//December 10th, 2021
//This program take in a number and figures out the sum off all the digits in it, and then figures out which numbers that sum is divisible by


import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = userInput.nextLine();
        int length = num.length();
        int sum = 0;
        int counter = 0;
        for (int i = 0; i<=length-1; i++){
            if(num.substring(i,i+1).equals("1"))
                sum+= 1;
            if(num.substring(i,i+1).equals("2"))
                sum+= 2;
            if(num.substring(i,i+1).equals("3"))
                sum+= 3;
            if(num.substring(i,i+1).equals("4"))
                sum+= 4;
            if(num.substring(i,i+1).equals("5"))
                sum+= 5;
            if(num.substring(i,i+1).equals("6"))
                sum+= 6;
            if(num.substring(i,i+1).equals("7"))
                sum+= 7;
            if(num.substring(i,i+1).equals("8"))
                sum+= 8;
            if(num.substring(i,i+1).equals("9"))
                sum+= 9;
            if(num.substring(i,i+1).equals("0"))
                sum+= 0;
        }
        System.out.println("The sum of digits is "+sum);
        System.out.print(sum+" is divisible by");
        if (sum%2 == 0)
            System.out.print(" 2");
        if (sum%3 == 0)
            System.out.print(", 3");
        if (sum%4 == 0)
            System.out.print(", 4");
        if (sum%5 == 0)
            System.out.print(", 5");
        if (sum%6 == 0)
            System.out.print(", 6");
        if (sum%8 == 0)
            System.out.print(", 8");
        if (sum%9 == 0)
            System.out.print(", 9");
        if (sum%10 == 0)
            System.out.print(", 10");
            
        System.out.print(".");
    }
}