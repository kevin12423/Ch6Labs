import java.util.Scanner;
import java.io.*;

/**
 * Created by kevin_000 on 2/8/2016.
 */
public class SalesReceiptDriver
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Please enter the quantity of candy bars you would like");
        Scanner input = new Scanner(System.in);
        int quant = input.nextInt();
        SalesReceipt receiptOne = new SalesReceipt("Candy Bars", 32456, quant);
        receiptOne.setRetail(.50);
        PrintWriter myfile = new PrintWriter("C:\\Users\\kevin_000\\Desktop\\Receipt.txt");
        myfile.println(receiptOne);
        myfile.close();
    }
}
