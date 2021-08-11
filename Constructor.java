import java.util.Scanner;
public class Constructor{
    int x=10;
    int y;
    String name="savan";
    public Constructor(int p,int q,String second)
    {
        x=p;
        y=q;
        name=second;
    }
    public static void main(String[] args)
    {
        Scanner game=new Scanner(System.in);
        System.out.println("please enter integer values that you want to assign");
        int g=game.nextInt();
        System.out.println("please enter new integer calues");
        int h=game.nextInt();
        Constructor savan=new Constructor(g,h,"ghori");
        System.out.println(savan.x);
        System.out.println(savan.name);
    }
    
}