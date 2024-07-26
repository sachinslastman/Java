public class MyProgram
{
    public static String repeater(String m, int x) {
        String subString = m.substring(0,(x));
        String newString = "";
        for (int a = 0; a < x; a++) {
            newString += subString;
        }
        return (newString);
    }
    
    public static double pythag (int a, int b) {
        int small = a*a;
        int med = b*b;
        return (Math.sqrt(small+med));
    }
    
    public static void doSomething (String doString, int doInt) {
        System.out.println("I am in DOSOMETHING");
        System.out.println(doString);
        System.out.println(doInt);
        doString = "High School";
        doInt = doInt + 5;
        System.out.println("I changed stuff");
        System.out.println(doString);
        System.out.println(doInt);
        System.out.println(pythag(7,24));
    } 
    public static void main(String[] args)
    {
        String msg1 = "Computer";
        msg1 = repeater(msg1,3);
        System.out.println(msg1);
        
        double value = pythag(5, 12);
        System.out.println(value);
        
        String voidString = "Enloe";
        int voidInt = 5;
        doSomething(voidString, voidInt);
        System.out.println("I am back in main");
        System.out.println(voidString);
        System.out.print(voidInt);
        
        for (int x = 0; x < 10; x++) {
            System.out.println(pythag(x,x+2));
        }
    }
}