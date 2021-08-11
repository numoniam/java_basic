import java.util.Scanner;
public class Pro{
    public static void main(String[] args)
    {
        System.out.println("this is switching example");
        Scanner savan=new Scanner(System.in);
        int day=savan.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("thuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("you ae out of scope please ensure it");
                    
                
        }
    }
}