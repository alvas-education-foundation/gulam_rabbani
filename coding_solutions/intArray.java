import java.util.*;
import java.util.Scanner;
public class ArrayInput {

	//Prefixed Fixed Code:
	
	
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in); 
	      System.out.println("Enter the length of the array:");
	      int length = sc.nextInt(); 
	      // create an array to save user input 
	      System.out.println("enter the elements:");
	      int[] name = new int[length];
	      int sum=0;//save the total sum of the array.
	
	try{	
	  
	  for(int i = 0 ; i < name.length ; i++)
	  {  
	 	 name[i] = sc.nextInt();
		 sum += name[i];
	  } 
	  System.out.print(sum);
	}
	catch(InputMismatchException e){
	 
	  System.out.print("You entered bad data.");
	}

 }
 }
