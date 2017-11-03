package session4;
//Package is a grouping of related types providing access protection and name 
//created as package session4
import java.util.Scanner;
//import scanner class is in util folder inside the java folder
//util contains utility classes
//scanner is a predefined class for taking inputs from user

public class TestDemo {
	//created class as TestDemo
	//classes are the basics of opps
			
		public static void main(String[] args) {
		
		 //System.out.println(Integer.parseInt(args[0]));
	//we are checking whether we gave zero or not 
		//int n1=Integer.parseInt(args[0]);
		int n1 = 0;
      if(n1==0){
 //using if loop checking that if it is equal to zero it shows that we have entered zero
    	  System.out.println("you have entered zero");//system is used to return code
          //out is a static number
          //println is used to print text and gives output

      String char1=null;
      //taking ASCII value as null it prints as null
      System.out.println("ASCII value of n is"+(char1));
 //prints the ASCII value
      }
	else if(n1<0)
//if we pass negative arguments it will show negative value
	{
		System.out.println("you have entered negative values");
	}else
	{
		//positive arguments
		System.out.println("you have entered positive values");
	}
   Scanner in=new Scanner(System.in);
   //we are using scanner to initialize the input values 
   System.out.print("Enter the marks of Physics");
   //it print the values
   int num1=in.nextInt();//nextInt reads the num2
   
   System.out.print("Enter the marks of Chemistry");

   int num2=in.nextInt();//nextInt reads the num2
   
   System.out.print("Enter the marks of Maths");

   int num3=in.nextInt();//nextInt reads the num2
    
   int physics=num1,chemistry=num2,maths=num3,average;
   //after intializing the marks it calculate the average value
   
   average=(physics+chemistry+maths)/3;
    if(average>=70)//if average grater than or equal to 70
    {
    	//if the value is equal to input then it show the grade
    	System.out.println("Grade A");

    }
    if((average>=61) && (average<70))
    {
    	System.out.println("Grade B");

    }
    if(average<61)//if average grater than or equal to 61
    {
    	System.out.println("Grade C");//prints

    }
		}    
    
}
