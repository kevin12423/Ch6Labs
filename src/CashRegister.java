import java.text.DecimalFormat;

/**
 * Created by kevin_000 on 2/5/2016.
 */
public class CashRegister
{
    private String description;  // Item description
    private int itemNumber;      // Item number
    private CostData cost;       // Cost data
    private double wholeSale;
    private double retail;
    private int quant;


    public CashRegister(String desc, int itemNum, int quant)
    {
        description = desc;
        itemNumber = itemNum;
        this.quant = quant;
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
                + "\nRetail Price: $"
                + dollar.format(retail)
                + "\nQuantity: " + quant
                + "\nSubtotal: $"
                + dollar.format(calcSubtotal())
                + "\nTax: $"
                + dollar.format(getTax())
                + "\nTotal: $"
                + dollar.format(total());



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
    public double calcSubtotal()
    {
        return quant * retail;

    }
    public double getTax()
    {
        return calcSubtotal() * 0.06;
    }
    public double total()
    {
        return (calcSubtotal() + getTax());
    }
}
