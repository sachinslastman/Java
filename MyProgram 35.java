import java.util.Scanner;
public class MyProgram
{
    public static int recur(int x) {
        int value = 0;
        if (x%2 == 0 && x>6) {
            value = recur(x-3) + 5;
        }
        else if (x%2 == 0 && x<=6) {
            value = recur(x+1) - 2;
        }
        else {
            value = x*2;
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number:");
        int myValue = userInput.nextInt();
        int enloe = recur(myValue);
        System.out.println("The value is: "+ enloe);
    }
}