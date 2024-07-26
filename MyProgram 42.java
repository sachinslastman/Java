//Sachin Lalka
//January 31st, 2022
//This program gets 2 numbers from the user, and then adds them together. It then puts those numbers in an array, and increments them by one. It then prints out the array and then asks for a number to mod by. It then mods all the numbers in the array by that numbers, then calculates the sum of the numbers and counts how many 0 are in the array and prints out that information

import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int [][] numbers = new int [3][4];
        int numZeros = 0;
        int sum = 0;
        int mod = 0;
        int total = 0;
        int counter = 0;
        String value1 = "";
        String value2 = "";
        System.out.println("Please enter the values, less than 10, for the element in the first row and column");
        value1 = userInput.nextLine();
        value2 = value1.substring(2,3);
        value1 = value1.substring(0,1);

        if (value1.equals("0"))
            total += 0;
        if (value1.equals("1"))
            total += 1;
        if (value1.equals("2"))
            total += 2;
        if (value1.equals("3"))
            total += 3;
        if (value1.equals("4"))
            total += 4;
        if (value1.equals("5"))
            total += 5;
        if (value1.equals("6"))
            total += 6;
        if (value1.equals("7"))
            total += 7;
        if (value1.equals("8"))
            total += 8;
        if (value1.equals("9"))
            total += 9;
        if (value2.equals("0"))
            total += 0;
        if (value2.equals("1"))
            total += 1;
        if (value2.equals("2"))
            total += 2;
        if (value2.equals("3"))
            total += 3;
        if (value2.equals("4"))
            total += 4;
        if (value2.equals("5"))
            total += 5;
        if (value2.equals("6"))
            total += 6;
        if (value2.equals("7"))
            total += 7;
        if (value2.equals("8"))
            total += 8;
        if (value2.equals("9"))
            total += 9;

        for (int i = 0; i < (numbers.length); i++) {
            for (int x = 0; x < (numbers[0].length); x++) {
                numbers[i][x] = (total+counter);
                counter += 1;
                if (x%4 == 0) {
                    System.out.println("");
                    System.out.print(" ");
                } 
                else
                    System.out.print(" ");
                    System.out.print(numbers[i][x]);
                    System.out.print(" ");
                
            }
        }
        counter = 0;
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Enter a number to mod by: ");
        mod = userInput.nextInt();
        
        for (int c = 0; c < numbers.length; c++) {
            for (int d = 0; d < numbers[0].length; d++) {
                numbers[c][d] = ((total+counter)%mod);
                sum += ((total+counter)%mod);
                counter += 1;
                if (d%4 == 0) {
                    System.out.println("");
                    System.out.print(" ");
                } 
                else
                    System.out.print(" ");
                    System.out.print(numbers[c][d]);
                    System.out.print(" ");
                    
                if ((total+counter)%mod == 0)
                    numZeros += 1;
            }
        }
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("The number of zeros is "+numZeros);
        System.out.println("The sum is "+sum);
        
    }
}