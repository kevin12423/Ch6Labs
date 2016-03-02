
/**
 * Created by kevin_000 on 2/8/2016.
 */

public class ParkingTicket

{
    private ParkedCar carOne;
    private int hoursParked;
    private int hoursPayedFor;
    private PoliceOfficer police;
       public ParkingTicket(ParkedCar carOne, PoliceOfficer name)
       {
           this.carOne = carOne;
           police = name;


       }
    public ParkingTicket(ParkedCar carOne)
    {
        this.carOne = carOne;



    }

    public void setHoursParked(int hoursParked)
    {
        this.hoursParked = hoursParked;
    }

    public void setHoursPayedFor(int hoursPayedFor)
    {
        this.hoursPayedFor = hoursPayedFor;
    }

    public int getHoursParked()
    {
        return hoursParked;
    }

    public int getHoursPayedFor()
    {
        return hoursPayedFor;
    }

    public String toString()
    {
        String str;  // To hold a descriptive string.

        // Create a string describing the item.
        str = "Car One: " + carOne.toString();

        // Return the string.
        return str;
    }

    public double calcFine(int hoursPayedFor, int hoursParked)
    {
        double fine = 25;
        double hourlyFine = 10;
        double fee = 0;
        double diff = (hoursParked - hoursPayedFor) / 60.0;
        if(diff > 0 && diff <= 1)
        {
           fee = fine;
        }
        else if (diff > 1)
        {
            fee =((int)diff * hourlyFine) + fine;
        }

        return fee;

    }

}
