public class P3 {
    static  void game(int x,String name)
    {
        System.out.println("your current age is " + " " +x);
        System.out.println("your name is "+ " "+name);
    }
    static void main(int age)
    {
        if(age>=18)
        {
            System.out.println("you are eligible for voting");
        }
        else
        {
            System.out.println("sorry we cant do anything for your voting");
        }
    }
    static  void game(int x)
    {
        int sum=0;
        if(x>0)
        {
            for(int i=0;i<=x;i++)
            {
                sum+=i;
            }
            System.out.println(sum);
        }
        else
        {
            System.out.println("please enter positive number");
        }
    }
    public static void main(String args[])
    {
        int x=10;
        int y=20;
        int z=x+y;
        System.out.println(z);
        main(20);
        game(10);
        game(10,"savan");
    }
}
