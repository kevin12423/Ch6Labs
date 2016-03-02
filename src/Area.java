/**
 * Created by kevin_000 on 2/3/2016.
 */
public class Area

{
    private double radius;
    private int length;
    private int width;
    private double height;




    public static double calcArea(double radius)
    {

        return  Math.PI * (radius * radius);

    }

    public static double calcArea(int length, int width)
    {
        return  length * width;
    }

    public static double calcArea(double radius, double height)
    {

        return 3.14 * (radius * radius) * height;
    }

}
