import java.util.Scanner;

public class RedGame{
    static int game(int x,int z)
    {
        if(x<z)
        {
        int y=(int)(Math.random()*((z-x)+1))+x;
        return y;
        }
        else
        {
            int j=(int)(Math.random()*((x-z)+1))+z;
            return j;
        }
    }
    public static void main(String[] args)
    {
        
        String second="please enter 5 interger for generate 5 random values";
        String ghori="generate random number in given values";
        Scanner sc=new Scanner(System.in);
        System.out.println(second.toUpperCase());
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        System.out.println(ghori.toUpperCase());
        int p=game(0,a);
        int q=game(a,b);
        int r=game(b,c);
        int s=game(c,d);
        int t=game(d,e);
        System.out.println("fist random genaretor number is :"+" "+p);
        System.out.println("second random genaretor number is :"+" "+q);
        System.out.println("third random genaretor number is :"+" "+r);
        System.out.println("four random genaretor number is :"+" "+s);
        System.out.println("five random genaretor number is :"+" "+t);
        int g=p+q+r+s+t;
        System.out.println("the sum of random generator number is :"+" "+ g);
        System.out.println("thaks for playing game");
        
        
        
        
    }
}