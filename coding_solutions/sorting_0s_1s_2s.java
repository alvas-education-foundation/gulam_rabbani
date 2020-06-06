import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class Main
{
	public static void threeWayPartition(int[] A, int end)
	{
		int start = 0, mid = 0;
		int pivot = 1;

		while (mid <= end)
		{
			if (A[mid] < pivot)
			{
				swap(A, start, mid);
				++start;
				++mid;
			}
			else if (A[mid] > pivot)
			{
				swap(A, mid, end);
				--end;
			}
			else
				++mid;
		}
	}
	private static void swap(int[] A, int i, int j) 
	{
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	public static void main (String[] args)
	{
	    Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        threeWayPartition(a, a.length - 1);
		System.out.println(Arrays.toString(a));
	}
}

