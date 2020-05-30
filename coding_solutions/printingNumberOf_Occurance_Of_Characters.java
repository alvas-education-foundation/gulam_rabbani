import java.io.*;
import java.util.Scanner;
public class Count 
{ 
    public static void main(String args[]) 
    { 
       Scanner string = new Scanner(System.in);
    String text;
    
    // Enter username and press Enter
    System.out.println("Enter the string:"); 
    text = string.nextLine();   
        int upper = 0, lower = 0, number = 0, special = 0; 
  
        for(int i = 0; i < text.length(); i++) 
        { 
            char ch = text.charAt(i); 
            if (ch >= 'A' && ch <= 'Z') 
                upper++; 
            else if (ch >= 'a' && ch <= 'z') 
                lower++; 
            else if (ch >= '0' && ch <= '9') 
                number++; 
            else
                special++; 
        } 
  
        System.out.println("Lower case letters : " + lower); 
        System.out.println("Upper case letters : " + upper); 
        System.out.println("Number : " + number); 
        System.out.println("Special characters : " + special); 
    } 
} 
