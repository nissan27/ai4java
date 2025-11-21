
/**
 * Write a description of class StringPractise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringPractise
{
    
    public static void main(String[] args)
       {
          String str1="Java Program";
          String str2= new String("Java");
          char c[]={'H','E','L','L','O'};
          String str3=new String(c,1,4);
          byte b[]={65,66,67,68};
          String str4=new String(b,1,3);
          
          System.out.println(str3);
        
          byte d[]={95,96,97,98};
          System.out.print(d);
          
          
       }
}