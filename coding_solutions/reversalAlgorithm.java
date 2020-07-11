import java.io.*;
import java.util.Scanner;
public class LeftRotate { 
    /* Function to left rotate arr[] of size n by d */
    static void leftRotate(int arr[], int d) 
    { 

        if (d == 0) 
            return; 
        int n = arr.length; 
        rvereseArray(arr, 0, d - 1); 
        rvereseArray(arr, d, n - 1); 
        rvereseArray(arr, 0, n - 1); 
    } 

    /*Function to reverse arr[] from index start to end*/
    static void rvereseArray(int arr[], int start, int end) 
    { 
        int temp; 
        while (start < end) 
        { 
            temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        } 
    } 

    /*UTILITY FUNCTIONS*/
    /* function to print an array */
    static void printArray(int arr[]) 
    { 
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " "); 
    } 

    /* Driver program to test above functions */
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of d:");
        int d =sc.nextInt(); 
        d = d % n; 
        leftRotate(arr, d);
        System.out.println("After rotation the array is:"); 
        printArray(arr); 
    } 
}
