//Sachin Lalka
//February 2nd, 2022
//This program gets to numbers, add them together, and the gets that number raised to the power of 2 and outputs that
import java.util.Scanner;
public class MyProgram
{
    public static int foil (int a, int b) {
        return ((a+b)*(a+b)); }
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 2 int values");
        int num1 = userInput.nextInt();
        int num2 = userInput.nextInt();
        System.out.println(foil(num1,num2)); }
}