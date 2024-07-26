//Sachin Lalka
//January 19th, 2022
//This program takes in 10 numbers and then calculates the max, min, average, median, and range of the numbers. It then looks through the array to find any duplicates

import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        int[] numbers = new int [10];
        Scanner userInput = new Scanner(System.in);
        int max = 0;
        int min = 0;
        int duplicate = 0;
        double median = 0;
        double average = 0;
        for (int x = 0; x < 10; x++) {
            System.out.print("Enter a number: ");
            int input = userInput.nextInt();
            numbers[x] = input;
        }
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-1; j++) {
                int temp = 0;
                if (numbers[j] > numbers[j+1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        
        System.out.println(" ");
        
        for (int y = 0; y < numbers.length; y++) {
            average += numbers[y];
            System.out.print(numbers[y]);
            System.out.print(" ");
        }
        
        max = numbers[numbers.length-1];
        min = numbers[0];
        median = (numbers[4]+numbers[5])/2.0;
        average = average/(numbers.length);
        
        for (int a = 0; a < numbers.length-1; a++) {
            for (int b = 0; b < numbers.length-1; b++) {
                if (b != a) {
                    if (numbers[a] == numbers[b]) {
                        duplicate = 1;
                    }
                }
            }
        }
        
        System.out.println(" ");
        System.out.println("The max is "+max);
        System.out.println("The min is "+min);
        System.out.println("The range is ("+max+" - "+min+")");
        System.out.println("The median is "+median);
        System.out.println("The average is "+average);
        if (duplicate == 1)
            System.out.println("There is a duplicate");
    }
}