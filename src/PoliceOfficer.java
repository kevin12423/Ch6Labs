/**
 * Created by kevin_000 on 2/9/2016.
 */
public class PoliceOfficer
{
    private String name;
    private String badgNumber;

    public void setBadgNumber(String badgNumber)
    {
        this.badgNumber = badgNumber;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public PoliceOfficer(String name, String badgNumber)
    {
        this.name = name;
        this.badgNumber = badgNumber;
    }

    public ParkingTicket patrol(ParkedCar car1, ParkingMeter meter1)
   {
       ParkingTicket ticket1 = new ParkingTicket(car1);
       if(ticket1.getHoursParked() > ticket1.getHoursPayedFor())
       {
           ticket1 = new ParkingTicket(car1, new PoliceOfficer(name,badgNumber));
       }
       else
       {
           System.out.println("No fee");
       }
       return ticket1;

   }

    @Override
    public String toString()
    {
        return "Name of officer: " + name +
                " Badge Number: " + badgNumber;
    }
}
