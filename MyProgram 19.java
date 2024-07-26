public class MyProgram
{
    public static void main(String[] args)
    {
    

    for (int i = 0; i<=3; i++) {
        for (int j = 0; j<i; j++) {
            System.out.print(i+" ");
            if ( i >= 9)
                i = 0;
            else
                i = i + 1;
        }
        System.out.println(" ");
    }


    }
}