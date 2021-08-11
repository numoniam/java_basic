import java.util.Scanner;
import java.util.Arrays;
public class DevGame{
    static int gamming(int x,int y)
    {
        if(x<y)
        {
            int p=(int)(Math.random()*((y-x)+1))+x;
            return p;
        }
        else
        {
            int q=(int)(Math.random()*((x-y)+1))+y;
            return q;
        }
    }
    public static void main(String[] args)
    {
        int store[]=new int[5];
        Scanner savan=new Scanner(System.in);
        System.out.println("please enter first random ranges");
        int a=savan.nextInt();
        System.out.println("please enter second random ranges");
        int b=savan.nextInt();
        System.out.println("please enter third random ranges");
        int c=savan.nextInt();
        System.out.println("please enter fourth random ranges");
        int d=savan.nextInt();
        System.out.println("please enter fifth random ranges");
        int e=savan.nextInt();
        System.out.println("lets start generating random values");
        store[0]=gamming(0,a);
        store[1]=gamming(a,b);
        store[2]=gamming(b,c);
        store[3]=gamming(c,d);
        store[4]=gamming(d,e);
        System.out.println("printing all the element pesent in arrays");
        for(int i=0;i<store.length;i++)
        {
            System.out.println(store[i]);
        }
        //sorting array to find max and min radom generator values
        Arrays.sort(store);
        int l=store.length;
        int j=l-1;
        System.out.println("maximuum value of genrator");
        System.out.println(store[j]);
        
        
    }
}