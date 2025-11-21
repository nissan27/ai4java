import java.util.Scanner;

/**
 * Write a description of class AushadhiPasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AushadhiPasal
{
    public static void main(String[] Args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Medicine name");
        String med_name=sc.nextLine();
        System.out.println("Medicine price");
        float med_price=sc.nextFloat();
        System.out.println("Quantity Needed");
        int quantity = sc.nextInt();
        System.out.println("Stock Level");
        int stock = sc.nextInt();
        
        System.out.println("The price of the medicine is: "+(med_price*stock));
        System.out.println("\n The remaining stock is:"+(stock-quantity));
    }
}