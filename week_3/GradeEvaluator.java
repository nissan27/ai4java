package week_3;
import java.util.Scanner;


public class GradeEvaluator
{
    
    public static void main(String[] Arg){
        
        Scanner s = new Scanner(System.in);
        System.out.println("write a number");
        int num = s.nextInt();
        
        String status = (num>=40)? "Pass": "Fail";
        
        System.out.println(status);
        
    }
}
