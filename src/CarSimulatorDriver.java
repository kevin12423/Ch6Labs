import java.util.Scanner;

/**
 * Created by kevin_000 on 2/9/2016.
 */
public class CarSimulatorDriver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many gallons of fuel do you have?");
        int gallons = input.nextInt();
        FuelGauge fuleGage = new FuelGauge(gallons);
        System.out.println("How many miles are on your car?");
        int miles = input.nextInt();
        Odemeter odometer = new Odemeter(miles);


        while (gallons >= 1)
        {
            fuleGage.usedFuel();
            System.out.println(fuleGage.usedFuel());
        }

    }
}
