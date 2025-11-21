import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        System.out.println("The sum of two numbers is: "+(num1+num2));
    }
}