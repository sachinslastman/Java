//Sachin Lalka
//January 12th, 2022
//This program takes a string, and then puts it in an array, then puts that array in reverse order in another array and then prints out the array


public class MyProgram
{
    public static void main(String[] args)
    {
        char[] oldList = new char [7];
        char[] newList = new char [7];
        String tacocat = "wposnsw";
        int counter = 0;
        
        for (int i = 0; i<oldList.length; i++) {
            oldList[i] = tacocat.charAt(i);
        }
        
        for (int x = oldList.length-1; x>=0; x--) {
            newList[counter] = oldList[x];
            counter += 1;
        }
        
        for (int j = 0; j<7; j++){
            System.out.print(newList[j]);
        }
    }
}