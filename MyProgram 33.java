import java.util.Scanner;
public class MyProgram
{
    public static int recur(int x)
    {
        int value = 0;
        if (x>6)
        {
            value = recur(x-3) + x - 2; //f(x-3) + x - 2 x>6
        }
        else if (x>2)
        {
            value = 2*recur(x-1) +1; //2*f(x-1) + 1 2<x<=6
        }
        else 
        {
            value = (x+1)*3;// (x+1)*3 otherwise
        }
        return value;
    }
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number:");
        int myValue = userInput.nextInt();
        int enloe = recur(myValue);
        System.out.println("The value is: "+ enloe);
    }
}