/**
 * Created by kevin_000 on 2/9/2016.
 */
public class Odemeter
{
    private int mileage;

    public Odemeter(int miles)
    {
        mileage = miles;
    }

    public void calcMiles()
    {
           while (mileage != 999998)
           {
               mileage += 1;
           }
            if( mileage > 999999)
            {
                mileage = 0;
            }
    }
    public void mpg(FuelGauge gage1)
    {
        if (mileage % 24 == 0)
        {
            gage1.usedFuel();
        }
    }
}
