/**
 * Created by kevin_000 on 2/5/2016.
 */
public class RetailDriver
{
    public static void main(String[] args)
    {
        RetailItem item = new RetailItem("Candy Bar",17789);
        item.setRetail(.75);
        item.setWholeSale(.50);
        System.out.println(item);
    }
}
