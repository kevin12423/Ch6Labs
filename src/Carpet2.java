/**
 * Created by kevin_000 on 2/4/2016.
 */
public class Carpet2
{
    private Carpet room1;
    private double cost;
    public Carpet2(double costin, Carpet room1in)
    {
        cost=costin;
        room1=room1in;
    }

    public double calcCost()
    {
        room1.calcArea();
        return (room1.calcArea() * cost);
    }
}
