package week_3;
import java.util.Scanner;



public class DateConverter
{
    public static void main(String[] Arg){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days");
        int days = sc.nextInt();
        
        int year = days/365;
        int rem1 = days % 365;
        int month = rem1/30;
        int rem2 = month % 30;
        
        System.out.println("The date division is "+ year +" years "+ month + " months " + rem2 + " days");
    } 
}