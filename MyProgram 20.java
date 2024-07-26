// Name - Sachin Lalka
// Date - 9/1/2021
// DonutIsland


public class MyProgram
{
    public static void main(String[] args)
    {
        double islandRadius = 2.08;
        double roundPi = 3.1415;
        double lakeRadius = .475;
        
        double lakeArea = lakeRadius*lakeRadius*roundPi;
        
        double islandArea = islandRadius*islandRadius*roundPi;
        
        double fertileLand = islandArea - lakeArea;
        
        System.out.println ("Donut island with a diameter of 4.16 miles that contains a circular lake of .95 miles has " +  fertileLand + " of fertile land");
    }
}