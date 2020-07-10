import java.util.Scanner;
import java.util.*;
public class SelectionSort
{  
    public static void selectionSort(int[] arr)
    {  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++)
            {  
                if (arr[j] < arr[index])
                {  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  

    public static void main(String a[])
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            arr1[i] = sc.nextInt();
        } 
        System.out.println("Before Selection Sort");  
        for(int i = 0; i < n; i++)
        {  
            System.out.print(arr1[i]+" ");  
        }  
        System.out.println();  
        selectionSort(arr1);
        System.out.println("After Selection Sort");  
        for(int i = 0; i < n; i++)
        {  
            System.out.print(arr1[i]+" ");  
        }  
    }  
}
