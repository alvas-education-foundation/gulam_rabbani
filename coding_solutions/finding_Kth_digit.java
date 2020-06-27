import java.util.*; 
import java.lang.*; 
import java.util.Scanner;

public class digit { 
    // To compute k-th digit in a^b 
    public static int kthdigit(int a, int b, int k) 
    { 
        // Computing a^b 
        int p = (int)Math.pow(a, b); 

        int count = 0; 
        while (p > 0 && count < k) { 

            // Getting last digit 
            int rem = p % 10; 

            // Increasing count by 1 
            count++; 

            // If current number is required digit 
            if (count == k) 
                return rem; 

            // Remove last digit 
            p = p / 10; 
        } 

        return 0; 
    } 

    public static void main(String argc[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a =sc.nextInt();
        System.out.println("Enter the value of b:");
        int b =sc.nextInt();
        System.out.println("Enter the value of k:");
        int k =sc.nextInt();
        System.out.println("The value of kth digit is");
        System.out.println(kthdigit(a, b, k)); 
    } 

} 
