import java.util.Scanner;
import java.util.*;

public class bitcount{ 

    static int countSetBits( int n) 
    { 
        int bitCount = 0; 

        for (int i = 1; i <= n; i++) 
            bitCount += countSetBitsUtil(i); 

        return bitCount; 
    } 
    static int countSetBitsUtil( int x) 
    { 
        if (x <= 0) 
            return 0; 
        return (x % 2 == 0 ? 0 : 1) +  
               countSetBitsUtil(x / 2); 
    } 
    public static void main(String[] args) 
    { 
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the value of n: "); 
        int n = sc.nextInt(); 
        System.out.print("Total set bit count is "); 
        System.out.print(countSetBits(n)); 
    } 
}
