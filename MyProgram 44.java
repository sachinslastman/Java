import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int score = 0;
        char answer = ' ';
        do {
            int card = (int)(Math.random()*12+1);
            score+=card;
            System.out.println("Your card is a "+card+", score is "+score);
            if (score < 21) {
            System.out.println("Would you like another card (Y/N)");
            answer=userInput.next().charAt(0);
            }
        }
        while((answer == 'Y' || answer == 'y') && score<=21);
            

    }
}