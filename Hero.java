public class Hero{
    static void vote(String name, int age)
    {
        if(age>18)
        {
            System.out.println("you are able to votting");
        }
        else
        {
            System.out.println("sorr we cant do this");
        }
    }
    public void random()
    {
        int x=(int)(Math.random()*100);
        System.out.println(x);
    }
    public static void main(String[] args)
    {
        vote("savan",19);
        //creat a ojject for accesing public clss
        Hero election=new Hero();
        election.random();
    }
}