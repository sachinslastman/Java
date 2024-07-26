//Sachin Lalka
//September 20, 2021
//TimeConvert


import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the time elaspsed in hours: ");
        int hours = userInput.nextInt();
        System.out.println("Please enter the time elaspsed in minutes: ");
        int minutes = userInput.nextInt();
        System.out.println("Please enter the time elaspsed in seconds: ");
        int seconds = userInput.nextInt();
        int convertHours = hours * 3600;
        int convertMinutes = minutes * 60;
        int convertedTime = convertHours + convertMinutes + seconds;
        double totalTime = convertedTime/60.0;
        System.out.println(+hours+":"+minutes+":"+seconds+" elasped time converts to:");
        System.out.println(convertedTime+" seconds");
        System.out.printf("%,.3f", totalTime);
        System.out.println(" minutes");
        
        
        
    }
}