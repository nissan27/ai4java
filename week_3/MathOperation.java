package week_3;
import java.util.Scanner;


public class MathOperation
{
    public static void main(String[] Arg)
    {
    Scanner s = new Scanner(System.in);
    System.out.println("Give me a number");
    int num1 = s.nextInt();
    
    System.out.println("Give me another number");
    int num2 = s.nextInt();
    
    int sum = num1 + num2;
    int product = num1 * num2;
    int difference = num1 - num2;
    float division = num1 / num2;
    
    boolean isLarger = (num1 > num2);
    int largest = isLarger ? num1 : num2;
    
    System.out.println("The largest number is: " + largest);
    
    
    

    
    
    

    }
}