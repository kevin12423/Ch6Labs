import java.util.Scanner;

/**
 * Created by kevin_000 on 2/4/2016.
 */
public class CarpetDriver
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the room");
        int length = input.nextInt();
        System.out.println("please enter the width of the room");
        int width = input.nextInt();
        System.out.println("Please enter the cost per square foot");
        double price = input.nextDouble();
        Carpet room = new Carpet(length,width);
        Carpet2 room1 = new Carpet2(price,room);
        System.out.println(room1.calcCost());

    }

}
