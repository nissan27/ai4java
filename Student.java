import java.util.Scanner;

/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    public static void main(String[] Arg)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your name");
        String name = sc.nextLine();
        
        System.out.println("Enter your age");
        int age = sc.nextInt();
        
        System.out.println("Your GPA");
        float GPA = sc.nextFloat();
        
        System.out.println("Name:"+name+"\nAge:"+age+"\nGPA:"+GPA);
        
        
    }
}