//Sachin Lalka
//October 15th, 2021
//This program asks the user if they would like to spin, and using a random number generator, gives the user a score, and then figures out if the score is high enough to win


import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like to spin? Y/N: ");
        String yesNo = userInput.nextLine();
        char YN = yesNo.charAt(0);
        int score = 0;
        int spin = 0;
        int won = 0;
        
            if (YN == 'Y') {
                spin = (int)(Math.random()*7+1);
                if (spin == 1 || spin == 2) {
                    score = score + spin * 3;
                } 
                
                else if (spin == 4 || spin == 5) {
                    score = score + spin;
                }
                
                else if (spin == 6) {
                    score = score - spin;
                }
                
                else if (spin == 7) {
                    score = score;
                }
                
                else if (spin == 3) {
                    System.out.println("You won with a spin 3");
                    won = 1;
                }
                  
            }   
                if (YN != 'N' && won != 1) {
                    System.out.println("You spun a "+spin+", your total score is "+score);
                    System.out.println("Would you like to spin again?: ");
                    String Yesno = userInput.nextLine();
                    char YN1 = Yesno.charAt(0);
                    if (YN1 == 'N') {
                        System.out.println("Your score was "+score+", you lose");
                    }
                    if (YN1 == 'Y') {
                        spin = (int)(Math.random()*7+1);
                    
                        if (spin == 1 || spin == 2) {
                        score = score + spin * 3;
                        won = 0;
                        } 
                
                        else if (spin == 4 || spin == 5) {
                        score = score + spin;
                        won = 0;
                        }
                
                        else if (spin == 6) {
                        score = score;
                        won = 0;
                        }
                
                        else if (spin == 7) {
                        score = score - spin;
                        won = 0;
                        }
                   
                        else if (spin == 3) {
                        System.out.println("You won with a spin 3");
                        won = 1;
                        }
                            
                            if (won != 1) { 
                                System.out.println("You spun a "+spin+", your total score is "+score);
                                if (score > 8); {
                                System.out.println("You won");
                                }
                                if (score <= 8) {
                                System.out.println("You lost");
                                }
                            }
                    }    
                    
                }
            if (YN == 'N') { 
                System.out.println("You lose");
            }
                
    }
}