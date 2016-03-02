import java.util.Scanner;

/**
 * Created by kevin_000 on 2/4/2016.
 */
public class LandDriver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the lenght of the track");
        int length = input.nextInt();
        System.out.println("Please enter the width of the track");
        int width = input.nextInt();
        Land trackOne = new Land(length,width);
        System.out.println("Track one has the area of " +trackOne.calcArea());
        System.out.println("Please enter the lenght of the second track");
        int length2 = input.nextInt();
        System.out.println("Please enter the width of the second track");
        int width2 = input.nextInt();
        Land trackTwo = new Land(length2,width2);
        System.out.println("The area of the second track is " + trackTwo.calcArea());
        if(trackOne.equals(trackTwo))
        {
            System.out.println(trackOne.toString());
        }
        else
        {
            System.out.println("The tracks are not the same size");
        }




    }
}
