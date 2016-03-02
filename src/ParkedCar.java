/**
 * Created by kevin_000 on 2/8/2016.
 */
public class ParkedCar
{
    private String make;
    private String model;
    private String color;
    private int licensePlateNumber;
    private int numMinutesParked;

    public ParkedCar(String make, String model, String color, int licensePlateNumber, int numMinutesParked)
    {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licensePlateNumber = licensePlateNumber;
        this.numMinutesParked = numMinutesParked;

    }

    public String toString()
    {
        return "Car Info: " + make + " " + model + " " + color + " " + licensePlateNumber;
    }

}

