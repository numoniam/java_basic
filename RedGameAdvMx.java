import java.util.Scanner;
import java.util.*;
import java.io.*;

public class RedGameAdvMx{
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
        int kishan[]=new int[5];
        
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
        kishan[0]=game(0,a);
        kishan[1]=game(a,b);
        kishan[2]=game(b,c);
        kishan[3]=game(c,d);
        kishan[4]=game(d,e);
        int p=kishan[0];
        int q=kishan[1];
        int r=kishan[2];
        int s=kishan[3];
        int t=kishan[4];
        System.out.println("fist random genaretor number is :"+" "+p);
        System.out.println("second random genaretor number is :"+" "+q);
        System.out.println("third random genaretor number is :"+" "+r);
        System.out.println("four random genaretor number is :"+" "+s);
        System.out.println("five random genaretor number is :"+" "+t);
        int g=p+q+r+s+t;
        System.out.println("the sum of random generator number is :"+" "+ g);
        System.out.println("thaks for playing game");
        System.out.println("all the element of array");
        for(int i=0;i<kishan.length;i++)
        {
            System.out.println(kishan[i]);
            
        }
        //find maximmum number in elements array
        /*int mx=kishan[0];
        for(int i=1;i<kishan.length;i++)
        {
            if(kishan[i]>mx)
            {
                mx=kishan[i];
                System.out.println("largest values in selected elements is :" +" "+mx);
            }
            
        }*/
        System.out.println("maximum number in array is");
        int n=kishan.length;
        Arrays.sort(kishan);
        System.out.println(kishan[n-1]);
        
        
        
        
    }
}