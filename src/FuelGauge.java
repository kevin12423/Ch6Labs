/**
 * Created by kevin_000 on 2/9/2016.
 */
public class FuelGauge
{
    private int currentGallons;

  public FuelGauge(int gallons)
  {
      this.currentGallons = gallons;
  }
    public void addFuel()
    {
        for (int x = 0; x <= 15; x++)
        {
            currentGallons += 1;
        }
    }
    public int usedFuel()
    {
        if(currentGallons >= 1)
        {
            for (int x = 0; x < currentGallons; x++ )
            {
                currentGallons -= 1;
            }
        }
        return currentGallons;
    }
}
