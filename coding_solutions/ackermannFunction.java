import java.util.Scanner;
import java.util.*;

public class ackermann
{  
  
    static int ack(int m, int n) 
    { 
        if (m == 0) 
        { 
            return n + 1; 
        } 
        else if((m > 0) && (n == 0)) 
        { 
            return ack(m - 1, 1); 
        } 
        else if((m > 0) && (n > 0)) 
        { 
            return ack(m - 1, ack(m, n - 1)); 
        }else
        return n + 1; 
    } 
  
    // Driver code 
    public static void main(String args[])  
    {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of m");
        int m=sc.nextInt();
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("The value of ackermann function for entered value is");
        System.out.println(ack(m, n));  
    }  
} 
