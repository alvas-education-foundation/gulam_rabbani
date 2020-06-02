mport java.util.*;
import java.util.Scanner;

public class SumArray {
	    
	    public static void sumSubsets( 
	        int set[], int n, int target) 
	    { 
	        
	        int x[] = new int[set.length]; 
	        int j = set.length - 1; 
	  
	        // Convert the array into binary array 
	        while (n > 0) { 
	            x[j] = n % 2; 
	            n = n / 2; 
	            j--; 
	        } 
	  
	        int sum = 0; 
	  
	        // Calculate the sum of this subset 
	        for (int i = 0; i < set.length; i++) 
	            if (x[i] == 1) 
	                sum = sum + set[i]; 
	  
	        // Check whether sum is equal to target 
	        // if it is equal, then print the subset 
	        if (sum == target) { 
	            System.out.println("{"); 
	            for (int i = 0; i < set.length; i++) 
	                if (x[i] == 1) 
	                    System.out.println(set[i] + ","); 
	            System.out.print("}, "); 
	        } 
	    } 
	  
	    // Function to find the subsets with sum K 
	    public static void findSubsets(int[] arr, int K) 
	    { 
	        // Calculate the total no. of subsets 
	        int x = (int)Math.pow(2, arr.length); 
	  
	        
	        for (int i = 1; i < x; i++) 
	            sumSubsets(arr, i, K); 
	    } 
	  
	    
	    public static void main(String args[]) 
	    { 
	        Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of elements you want in array:");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter all the elements:");
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the value of k:");
	        int K =sc.nextInt(); 
	        findSubsets(arr, K); 
	    }
}
