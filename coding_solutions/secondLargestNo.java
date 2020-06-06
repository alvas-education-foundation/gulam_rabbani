import java.util.Scanner;
import java.util.*;
public class SecondLargestInArrayExample
{  
    public static int getSecondLargest(int[] a, int total)
    {  
        int temp;  
        for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-2];  
    }  
    public static void main(String args[])
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Second Largest: "+getSecondLargest(a,a.length));  
    }
} 
