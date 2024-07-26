import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Number of points? ");
        int points = userInput.nextInt();
        for (int x = 1; x <= points; x++){
            double rawPercent = (double)x*100/points;
            double curvePercent = Math.sqrt(rawPercent)*10;
            int finalCurve = (int)curvePercent;
            System.out.print(x+" = "+finalCurve+ " ");
            if (x%3 == 0)
                System.out.println(" ");
        }
    }
}