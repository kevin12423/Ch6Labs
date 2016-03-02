import java.util.Scanner;

/**
 * Created by kevin_000 on 2/8/2016.
 */
public class ParkingTicketDriver
{
    public static void main(String[] args)
    {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the amount of time you paid to park for");
            int timePayed = input.nextInt();
            ParkingMeter meter1 = new ParkingMeter(timePayed);
            System.out.println("Please enter the amount of time you parked for");
            int timeParked = input.nextInt();

            ParkedCar car1 = new ParkedCar("Chevy", "Malibu", "Dark-Blue", 523211, 120);
            PoliceOfficer officer1 = new PoliceOfficer("Bad-News Billy", "67676");
            ParkingTicket ticketOne = new ParkingTicket(car1);
            System.out.println(ticketOne);

            if(ticketOne.calcFine(timePayed,timeParked) != 0)
            {
                System.out.println(officer1);
                System.out.println("Fee: " + ticketOne.calcFine(timePayed,timeParked));
            }
        else
            {
                System.out.println("No fee");
            }


    }
}
