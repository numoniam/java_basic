public class P2{

   //in java programme possible to write more than one MAIN method but in parameter signature shoude be different  
   //you can call method multiple time in main method
   //you have to type of method PUBLIC and STATIC method
   //public method only access in main method with help of creating class objects
   //class object only creating by using calss
        
   static  void main(int a,int b)
    {
         int c=a+b;
         System.out.println("the sum of given number is "+ " "+c);
    }

	public static void main(String[] args)
	
	{ 
	    System.out.println("hello");
	    main(10,29);
	    main(30,54);

	}
}