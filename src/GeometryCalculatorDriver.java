import java.util.Scanner;

/**
 * Created by kevin_000 on 2/8/2016.
 */
public class GeometryCalculatorDriver
{
    public static void main(String[] args)
    {
        GeometryCalculator numberOne = new GeometryCalculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Geometry Calculator:");
        System.out.println("1. \t Calculate the area of a circle");
        System.out.println("2. \t Calculate the area of a Rectangle");
        System.out.println("3. \t Calculate the area of a Triangle");
        System.out.println("4. \t Quit");
        System.out.println("Enter your choice 1-4");
        int choice = input.nextInt();
        if (choice == 1)
        {
            System.out.println("Please enter the Radius of the circle");
            int radius = input.nextInt();
            numberOne.setRadius(radius);
            if (radius > 0)
            {
                System.out.println(numberOne.calcAreaCircle());
            }
            else
            {
                System.out.println("Please enter positive numbers");
            }

        }
        else if(choice == 2)
        {
            System.out.println("Please enter the Length of the rectangle");
            int length = input.nextInt();
            numberOne.setLength(length);
            System.out.println("Please enter the width of the rectangle");
            int width = input.nextInt();
            numberOne.setWidth(width);
            if (length > 0 && width > 0)
            {
                System.out.println(numberOne.calcAreaRec());
            }
            else
            {
                System.out.println("Please enter positive numbers");
            }

        }

        else if(choice == 3)
        {
            System.out.println("Please enter the Base of the triangle");
            int base = input.nextInt();
            numberOne.setBase(base);
            System.out.println("Please enter the height of the rectangle");
            int triHeight = input.nextInt();
            numberOne.setTriHeight(triHeight);
            if (base > 0 && triHeight > 0)
            {
                System.out.println(numberOne.calcAreaTri());
            }
            else
            {
                System.out.println("Please enter positive numbers");
            }

        }
        else if (choice == 4)
        {
            System.out.println("Program has ended");
        }
        else
        {
            System.out.println("Please enter a number 1-4");
        }

    }
}
