//Sachin Lalka
//Sept 9, 2021
//IdentityTheft
import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner keyInput = new Scanner(System.in);
        System.out.println("Enter first set of digits: ");
        int num1 = keyInput.nextInt();
        System.out.println("Enter second set of digits: ");
        int num2 = keyInput.nextInt();
        System.out.println("Enter third set of digits: ");
        int num3 = keyInput.nextInt();
        System.out.println("Enter fourth set of digits: ");
        int num4 = keyInput.nextInt();
        int remainder = (num1 + num2 + num3 + num4)%26;
        
        System.out.println("The correct number and code is " +num1+" "+num2+" "+num3+" "+num4+" "+(char)(remainder+65));

    }
}