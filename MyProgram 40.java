//Sachin Lalka
//April 20th, 2022
//Methods Challenge

import java.util.Scanner;
public class MyProgram
{
    public static double slope(int X1, int Y1, int X2, int Y2) {
        double slope1 = (Y2-Y1);
        double slope2 = (X2-X1);
        double slope = slope1/slope2;
        return slope;
    }
    public static void printEquation(int X1, int Y1, double M) {
        System.out.println("Y - "+Y1+" = "+M+"(X - "+X1+")");
    }
    public static double distance(int X1, int Y1, int X2, int Y2) {
        double xSquared = (X1-X2)*(X1-X2);
        double ySquared = (Y1-Y2)*(Y1-Y2);
        double distance = Math.sqrt(xSquared + ySquared);
        return distance;
    }
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter X1 ");
        int X1 = userInput.nextInt();
        System.out.print("Enter Y1 ");
        int Y1 = userInput.nextInt();
        System.out.print("Enter X2 ");
        int X2 = userInput.nextInt();
        System.out.print("Enter Y2 ");
        int Y2 = userInput.nextInt();
        double M = slope(X1, Y1, X2, Y2);
        System.out.println("");
        System.out.println("The slope is "+M);
        System.out.print("The equation is ");
        printEquation(X1, Y1, M);
        System.out.println("The distance is "+distance(X1, Y1, X2, Y2));
    }
}