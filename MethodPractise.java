  

public class MethodPractise
{
    static int max(int x, int y){
        if (x>y)
            return x;
        else
            return y;
    }


    public static void main(String[] Args){
        int a=99, b=78;
        int c = max(a,b);
        
        System.out.println(c);
    }
}
