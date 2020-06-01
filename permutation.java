import java.util.Scanner;
import java.util.*;

public class npr
{
	double fact(double n)
	{
	   int i=1;
             	    double fact=1;
	    while(i<=n)
	    {
	   	   fact=fact*i;
		   i++;
 	    }
  	      return fact;
	}
	double permutation(int n,int r )
	{
		double per=fact(n)/fact(n-r);	
		return per;
	}
	public static void main(String arg[])	
	{
		npr p=new npr( );
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
               	int n=sc.nextInt();
		System.out.println("enter value of r");
              		int r=sc.nextInt();
		if(n>=r)
		{
		System.out.println("The value of "+n+"p"+r+" is : "+p.permutation(n,r));	
		}
		else
			System.out.println("Error!!!!!");
		System.out.println("n value should be greater than or equals to r value");
		
	}	
}
