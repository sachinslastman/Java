//Sachin Lalka

import java.util.Scanner;
public class MyProgram
{
    // returns the sum of the row indicated by the parameter
    public static int rowSum(int arr [][], int row){
        int rowSum = 0;
        if (row >= 0 && row < 4) {
            for (int x = 0; x<4; x++) {
                rowSum += arr[row][x];
            }
        }
        else {
            rowSum = -9999;
        }
        return rowSum;
    }
    // returns the sum of the column indicated by the parameter
    public static int colSum(int arr [][],int col){
        int colSum = 0;
        if (col >= 0 && col < 4) {
            for (int i = 0; i < 4; i++) {
                colSum += arr[i][col];
            }
        }
        else {
            colSum = -9999;
        }
        return colSum;
    }
    public static void main(String[] args)
    {
        int [][] arr = {{1,2,3,4}, {8,9,10,11},{6,25,9,4},{2,3,9,12}};
        System.out.println(rowSum(arr,1));
        System.out.println(colSum(arr,4));
        System.out.println(colSum(arr,5));
        System.out.println(rowSum(arr,2));
        
    }
}