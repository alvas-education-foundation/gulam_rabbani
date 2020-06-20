import java.util.*; 
import java.util.Scanner;
  
public class Count { 
      
    // Function that count set bits 
    public static int countSetBits(int n) 
    { 
        int count = 0; 
        while (n != 0) { 
            count++; 
            n &=(n-1); 
        } 
        return count; 
    } 
  
    // Function that return count of 
    // flipped number 
    public static int FlippedCount(int a, int b) 
    { 
        // Return count of set bits in 
        // a XOR b 
        return countSetBits(a ^ b); 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of a:");
        int a = sc.nextInt(); 
        System.out.print("enter the value of b:");
        int b = sc.nextInt(); 
        System.out.print(FlippedCount(a, b)); 
    } 
}
