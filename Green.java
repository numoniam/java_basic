import java.util.Scanner;

public class Green{
    public static void main(String args[])
    {
        Scanner fun=new Scanner(System.in);
        int day=fun.nextInt();
        switch(day)
        {
            case 1:
                int sum=0;
                for(int i=0;i<=1;i++)
                {
                    sum+=i;
                }
                System.out.println(sum);
                break;
        }
    }
}