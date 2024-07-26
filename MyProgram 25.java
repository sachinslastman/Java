//Sachin Lalka
//November 30th, 2021
//This programs takes a number in base 12, and then using an equation, converts that number into base 10, and then prints that number out


import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number in base 12: ");
        String num = userInput.nextLine();
        char num1 = num.charAt(0);
        char num2 = num.charAt(1);
        char num3 = num.charAt(2);
        char num4 = num.charAt(3);
        int total = 0;
        
        if (num1 == 'A' || num1 == 'B') {
            if (num1 == 'A')
            total = total + (10*1728);
            if (num1 == 'B')
            total = total + (11*1728);
        }
        else {
            if (num1 == '0')
                total = total + (0);
            if (num1 == '1')
                total = total + (1*1728);
            if (num1 == '2')
                total = total + (2*1728);
            if (num1 == '3')
                total = total + (3*1728);
            if (num1 == '4')
                total = total + (4*1728);
            if (num1 == '5')
                total = total + (5*1728);
            if (num1 == '6')
                total = total + (6*1728);
            if (num1 == '7')
                total = total + (7*1728);
            if (num1 == '8')
                total = total + (8*1728);
            if (num1 == '9')
                total = total + (9*1728);
        }
                
        if (num2 == 'A' || num2 == 'B') {
            if (num2 == 'A')
            total = total + (10*144);
            if (num2 == 'B')
            total = total + (11*144);
        }
        else {
            if (num2 == '0')
                total = total + (0);
            if (num2 == '1')
                total = total + (1*144);
            if (num2 == '2')
                total = total + (2*144);
            if (num2 == '3')
                total = total + (3*144);
            if (num2 == '4')
                total = total + (4*144);
            if (num2 == '5')
                total = total + (5*144);
            if (num2 == '6')
                total = total + (6*144);
            if (num2 == '7')
                total = total + (7*144);
            if (num2 == '8')
                total = total + (8*144);
            if (num2 == '9')
                total = total + (9*144);
        }
        
        if (num3 == 'A' || num3 == 'B') {
            if (num3 == 'A')
            total = total + (10*12);
            if (num3 == 'B')
            total = total + (11*12);
        }
        else {
            if (num3 == '0')
                total = total + (0);
            if (num3 == '1')
                total = total + (1*12);
            if (num3 == '2')
                total = total + (2*12);
            if (num3 == '3')
                total = total + (3*12);
            if (num3 == '4')
                total = total + (4*12);
            if (num3 == '5')
                total = total + (5*12);
            if (num3 == '6')
                total = total + (6*12);
            if (num3 == '7')
                total = total + (7*12);
            if (num3 == '8')
                total = total + (8*12);
            if (num3 == '9')
                total = total + (9*12);
        }
        
        if (num4 == 'A' || num4 == 'B') {
            if (num4 == 'A')
            total = total + (10*1);
            if (num4 == 'B')
            total = total + (11*1);
        }
        else {
            if (num4 == '0')
                total = total + (0);
            if (num4 == '1')
                total = total + (1*1);
            if (num4 == '2')
                total = total + (2*1);
            if (num4 == '3')
                total = total + (3*1);
            if (num4 == '4')
                total = total + (4*1);
            if (num4 == '5')
                total = total + (5*1);
            if (num4 == '6')
                total = total + (6*1);
            if (num4 == '7')
                total = total + (7*1);
            if (num4 == '8')
                total = total + (8*1);
            if (num4 == '9')
                total = total + (9*1);
        }
        
        System.out.print("That number in base 10 would be "+total);
    }
}