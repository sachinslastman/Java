//Sachin Lalka
//April 18th, 2022
//This program calculates the area of a triangle by either multiplying the base times the height then dividing that by 2, or multiplying 2 sides of the triangle by the sin of a angle, and then dividing it by 2

import java.util.Scanner;
public class MyProgram
{
    public static void easyArea (double height, double base) {
        double eArea = (base*height)/2;
        System.out.println("Easy area method: "+eArea);
    } 
    public static double toRad (double angle) {
        double rad = angle * ((Math.PI)/180);
        return(rad);
    }
    public static void hardArea (double a, double b, double radAngle) {
        double hArea = 0.5*(a*b*(Math.sin(radAngle)));
        System.out.println("Hard area method: "+hArea);
    }
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the height: ");
        double height = userInput.nextDouble();
        System.out.print("Enter the base: ");
        double base = userInput.nextDouble();
        System.out.println();
        easyArea(height, base);
        System.out.println();
        System.out.print("Enter the length of side A: ");
        double a = userInput.nextDouble();
        System.out.print("Enter the length of side B: ");
        double b = userInput.nextDouble();
        System.out.print("Enter the angle: ");
        double angle = userInput.nextDouble();
        double radAngle = toRad(angle);
        System.out.println();
        hardArea(a, b, radAngle);
        
    }
}