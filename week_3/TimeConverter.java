package week_3;
import java.util.Scanner;


public class TimeConverter
{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of seconds");
        int sec = sc.nextInt();
        
        int hour = sec/3600;
        int rem1 = sec % 3600;
        int minute = rem1/60;
        int rem2 = rem1 % 60;
        
        System.out.println("The time division is "+ hour +" hours "+ minute + " minutes " + rem2 + " seconds");
        
        
    }
}