import java.util.Scanner;

public class Eye{
    static int max(int x,int y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    static double max(double x,double y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    static void  random(int x,int y)
    {
        if(x<y)
        {
            int q=(int)(Math.random()*(y-x))+x;
            System.out.println(q);
        }
        else if(x>y)
        {
            int p=(int)(Math.random()*(x-y))+y;
            System.out.println(p);
        }
        else
        {
            System.out.println("please enter right values");
        }
    }
    static void random(int x)
    {
        if(x>0)
        {
            int s=(int)(Math.random()*x);
            System.out.println(s);
        }
    }
    public static void main(String[] args)
    {
        Scanner savan=new Scanner(System.in);
        System.out.println("please enter starting range number");
        int a=savan.nextInt();
        System.out.println("please enter ending number of range"); 
        int b=savan.nextInt();
        random(a,b);
        random(a);
        
    }
}

