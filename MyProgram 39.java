//Sachin Lalka
//December 8th, 2021
//Thus prgoram caluculates the grade curve based off of how many points the quiz is worth

import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many points is the quiz worth? ");
        int grade = userInput.nextInt();
        double finalGrade = 0;
        int count = 1;
        int j = 1;
        
        for (int i = 1; i<=grade/3; i++){
           for (j = j; j<=3; j++){
            finalGrade = ((Math.sqrt(count/12.0))*100);
            finalGrade = Math.floor(finalGrade);
            System.out.printf(+count+" = %,.0f",finalGrade);
            System.out.print(" ");
            count+=1;
           }
           System.out.println(" ");
           
        }
    }
}