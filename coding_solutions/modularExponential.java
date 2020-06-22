mport java.io.*; 
import java.util.Scanner;
public class modexp
{ 

    static int pow(int x, int y, int p) 
    { 

        int result = 1;      
        x = x % p;  

       if (x == 0) return 0;    

        while (y > 0) 
        { 
            if((y & 1)==1) 
                result= (result * x) % p; 
            y = y >> 1;  
            x = (x * x) % p;  
        } 
        return result; 
    } 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x =sc.nextInt();
        System.out.println("Enter the value of y:");
        int y =sc.nextInt(); 
        System.out.println("Enter the value of p:");
        int p =sc.nextInt(); 
        System.out.println("Power is " + pow(x, y, p)); 
    } 
} 
