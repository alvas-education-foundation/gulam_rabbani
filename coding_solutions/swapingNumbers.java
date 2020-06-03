import java.util.Scanner;
import java.util.*;
public class Swapping 
{
    public static void main(String[] args) 
    {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter first number:");
		    int a =sc.nextInt();
		    System.out.println("Enter second number:");
		    int b =sc.nextInt();
		    System.out.println("Before swapping, a = " + a + " and b = " + b);
		    swapFunction(a, b);
		      
	}
	public static void swapFunction(int a, int b)
	{
		     
		  int c = a;
		  a = b;
		  b = c;
		  System.out.println("After swapping(Inside), a = " + a + " b = " + b);
	}
		
}
