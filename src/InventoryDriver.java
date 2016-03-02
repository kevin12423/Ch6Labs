import sun.security.x509.IssuerAlternativeNameExtension;

import java.util.Scanner;

/**
 * Created by kevin_000 on 2/4/2016.
 */
public class InventoryDriver
{

    public static void main(String[] args)
    {
        Inventory one = new Inventory("Veggies");

        Inventory two = new Inventory(one);

        System.out.println(two);


    }
}
