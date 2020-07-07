import java.util.Scanner;
import java.util.*;
public class InsertionSort
{  
    public static void insertionSort(int array[])
    {  
        int n = array.length;  
        for (int j = 1; j < n; j++)
        {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) )
            {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  

    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Before Insertion Sort");    
        for(int i=0;i<n;i++)
        {    
            System.out.print(" "+arr1[i]);    
        }    
        System.out.println();    

        insertionSort(arr1);//sorting array using insertion sort    

        System.out.println("After Insertion Sort");    
        for(int i=0;i<n;i++)
        {    
            System.out.print(" "+arr1[i]);    
        }     
    }    
} 
