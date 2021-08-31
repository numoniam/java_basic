public class P4 {
    static int game(int x,int y)
    {
        if(x>0&&y>0)
        {
            return x+y;
        }
        else
        {
            System.out.println("please enter positive values");
            return 0;
        }
    }
    public static void main(String[] args)
    {
        int a=game(23,34);
        System.out.println(a);
    }
}
