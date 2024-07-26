import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        String board [][] = {{"[ ]","[ ]","[ ]"},{"[ ]","[ ]","[ ]"},{"[ ]","[ ]","[ ]"}};
        Scanner userInput = new Scanner(System.in);
        int rowX = 0;
        int colX = 0;
        int rowO = 0;
        int colO = 0;
        int numOfPlays = 0;
        int counter = 1;
        int winX = 0;
        int winO = 0;
        int tie = 0;
        int sayOnce = 0;
        while (winX == 0 && winO == 0 && tie == 0) {
            System.out.println("X - Enter a number for the row and column");
            rowX = userInput.nextInt()-1;
            colX = userInput.nextInt()-1;
            numOfPlays += 1;
            if (board[rowX][colX] == "[ ]")
                board[rowX][colX] = " X ";
            for (int a = 0; a < 3; a++) {
                for (int b = 0; b < 3; b++) {
                    if (counter%3 == 0) {
                        System.out.print(board[a][b]);
                        System.out.println("");
                        counter += 1;
                    }
                    else {
                        System.out.print(board[a][b]);
                        counter += 1;
                    }
                }
            }
            for (int colNum = 0; colNum<3; colNum++) {
                if ((board[colNum][0].equals(" X ")&&board[colNum][1].equals(" X ")&&board[colNum][2].equals(" X "))||(board[0][colNum].equals(" X ")&&board[1][colNum].equals(" X ")&&board[2][colNum].equals(" X "))||(board[0][0].equals(" X ")&&board[1][1].equals(" X ")&&board[2][2].equals(" X "))||(board[2][0].equals(" X ")&&board[1][1].equals(" X ")&&board[0][2].equals(" X ")))
                    sayOnce+= 1;
                    if (sayOnce>1)
                     sayOnce = 1;
            }
            if (sayOnce == 1) {
                System.out.println("X WON");
                winX = 1;
            }
            if (numOfPlays == 9) {
                    System.out.println("TIE GAME");
                    tie = 1;
            }
            if (winX != 1 && tie != 1) {
                System.out.println("O - Enter a number for the row and column");
                rowO = userInput.nextInt()-1;
                colO = userInput.nextInt()-1;
                numOfPlays+= 1;
                if (board[rowO][colO] == "[ ]")
                    board[rowO][colO] = " O ";
                for (int c = 0; c < 3; c++) {
                    for (int d = 0; d < 3; d++) {
                        if (counter%3 == 0) {
                            System.out.print(board[c][d]);
                            System.out.println("");
                            counter += 1;
                        }
                        else {
                            System.out.print(board[c][d]);
                            counter += 1;
                        }
                    }
                }
                for (int colNum = 0; colNum<3; colNum++) {
                    if ((board[colNum][0].equals(" O ")&&board[colNum][1].equals(" O ")&&board[colNum][2].equals(" O "))||(board[0][colNum].equals(" O ")&&board[1][colNum].equals(" O ")&&board[2][colNum].equals(" O "))||(board[0][0].equals(" O ")&&board[1][1].equals(" O ")&&board[2][2].equals(" O "))||(board[2][0].equals(" O ")&&board[1][1].equals(" O ")&&board[0][2].equals(" O ")))
                        sayOnce+= 1;
                        if (sayOnce>1)
                            sayOnce = 1;
                }
                if (sayOnce == 1) {
                    System.out.println("O WON");
                    winO = 1;
                }
                if (numOfPlays == 9) {
                    System.out.println("TIE GAME");
                    tie = 1;
                }
            }
        }
            
        }
}