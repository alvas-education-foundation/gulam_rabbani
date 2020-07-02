import java.util.*; 
import java.util.Scanner;
public class array
{ 
    static int minimumAdjacentDifference(int a[],int n, int k) 
    {
        int minDiff = Integer.MAX_VALUE; 
        for (int i = 0; i < (1 << n); i++)
        { 
            int cnt = Integer.bitCount(i); 
            if (cnt == n - k)
            {
                Vector<Integer> temp = new Vector<Integer>(); 
                for (int j = 0; j < n; j++)
                { 
                    if ((i & (1 << j)) != 0) 
                        temp.add(a[j]); 
                }
                int maxDiff = Integer.MIN_VALUE; 
                for (int j = 0; j < temp.size() - 1; j++)
                { 
                    maxDiff = Math.max(maxDiff,  
                    temp.get(j + 1) - temp.get(j)); 
                } 
                minDiff = Math.min(minDiff, maxDiff); 
            } 
        } 
        return minDiff; 
    } 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("The output is:");
        System.out.println(minimumAdjacentDifference(a, n, k)); 
    } 
}
