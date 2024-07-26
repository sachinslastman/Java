//Sachin Lalka
//December 14th, 2021
//This program takes that grades from a x number of students and then finds the average of the grades, number of grades, and sum of the grades

import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int grade = 0;

        int counter = 1;
        int numOfGrades = 0;
        int totalGrade = 0;
        int x = 20;
        int complete = 0;
        char trueFalse = 'y';
        String suffix = "st";
        
       
        while (trueFalse == 'y' || trueFalse == 'Y') {
            
            if ((counter - x)>10)
                x+=10;
            if (counter == 1) { 
                suffix = "st";
                complete = 1;
            }
            if (counter == 2) {
                suffix = "nd";
                complete = 1;
            }
            if (counter == 3) {
                suffix = "rd";
                complete = 1;
            }
            if (counter >= 4 && counter <= 20) {
                suffix = "th";
                complete = 1;
            }
            if (counter>20 && (counter - x) == 1) {
                suffix = "st";
                complete = 1;
            }
            if (complete != 1 && counter>20 && (counter - x) == 2) {
                suffix = "nd";
                complete = 1;
            }
            if (complete != 1 && counter>20 && (counter - x) == 3) {
                suffix = "rd";
                complete = 1;
            }
            if (complete == 0) 
                suffix = "th";
            
            complete = 0;
            
            System.out.println("Enter the "+counter+""+suffix+" grade");
            grade = userInput.nextInt();
            if (grade>=0 && grade<=100) { 
                numOfGrades+= 1;
                totalGrade+= grade;
                counter+=1;
                 System.out.println("Would you like to add another grade? ");
                trueFalse = userInput.next().charAt(0);
            }
            else
                System.out.println("Enter a valid grade");
        }
        
        System.out.println("You have entered "+numOfGrades+" grades");
        System.out.println("The sum of the grades was "+totalGrade);
        System.out.println("The average grade was "+((double)totalGrade/numOfGrades));
        
    }
}