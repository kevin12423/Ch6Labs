import java.text.DecimalFormat;

/**
 * Created by kevin_000 on 2/5/2016.
 */

public class RetailItem
{
    private String description;  // Item description
    private int itemNumber;      // Item number
    private CostData cost;       // Cost data
    private double wholeSale;
    private double retail;


    public RetailItem(String desc, int itemNum)
    {
        description = desc;
        itemNumber = itemNum;
    }

    public void setRetail(double retail)
    {
        this.retail = retail;
    }

    public void setWholeSale(double wholeSale)
    {
        this.wholeSale = wholeSale;
    }

    public double getRetail()
    {
        return retail;
    }

    public double getWholeSale()
    {
        return wholeSale;
    }

    public String toString()
    {
        String str;  // To hold a descriptive string.

        // Create a DecimalFormat object to format output.
        DecimalFormat dollar = new DecimalFormat("$#,##0.00");

        // Create a string describing the item.
        str = "Description: " + description
                + "\nItem Number: " + itemNumber
                + "\nWholesale Cost: $"
                + dollar.format(wholeSale)
                + "\nRetail Price: $"
                + dollar.format(retail);

        // Return the string.
        return str;
    }



    private class CostData
    {
        public double wholesale,  // Wholesale cost
                retail;     // Retail price



        public CostData(double w, double r)
        {
            wholesale = w;
            retail = r;
        }
    }
}
