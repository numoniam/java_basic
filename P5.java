import java.util.Scanner;
//this programme is about generating random number given range that range through user input
public class P5 {
    static void randomgame(int x)
    {
        if(x>0)
        {
            System.out.println("we are goin to generating random nyumber between 0 to"+" "+x);
            int y=(int)(Math.random()*x);
            System.out.println(y);
        }
        else
        {
            System.out.println("please enter positive values");
        }

    }
    public static void main(String[] args)
    {
        Scanner select=new Scanner(System.in);
        System.out.println("plese enter range you want print number between this range1 ");
        int j=select.nextInt();
        randomgame(j);


    }
}
