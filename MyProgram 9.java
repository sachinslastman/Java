import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the amount of money in dollars.cents: ");
        double money = userInput.nextDouble();
        double multi = money * 100;
        int cents = ((int)multi%100);
        int dollars = ((int)multi)/100;
        System.out.print("$"+money+" has "+dollars+" dollars and "+cents+" cents");
    }
}