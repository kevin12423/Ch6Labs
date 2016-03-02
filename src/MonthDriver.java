/**
 * Created by kevin_000 on 2/5/2016.
 */
public class MonthDriver
{
    public static void main(String[] args)
    {
        Month monthOne = new Month(1);
        Month monthTwo = new Month(5);
        System.out.println(monthOne);

        if (monthOne.equals(monthTwo))
        {
            System.out.println("They are equal");
        }
        else
        {
            System.out.println("They are not equal");
        }

    }
}
