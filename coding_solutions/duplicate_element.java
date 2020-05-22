import java.util.*;
import java.util.Scanner;
 public class repeatedelement
 {
     public static void main (String[] args)
     {
         int flag=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the length of array");
         int length=sc.nextInt();
         int [] myarray=new int[length];
         System.out.println("Enter Array Elements:");
         for(int i=0;i<length;i++)
         myarray[i]=sc.nextInt();
         System.out.println("the Array Elements are:");
         for(int i =0;i<length;i++)
               System.out.println(myarray[i]);
               
         for (int j=0; j<myarray.length; j++)
             for(int k=j+1; k<myarray.length; k++)
             if (myarray[j]==myarray[k])
            {
              System.out.println("Duplicate elements are:"+""+myarray[j]);
             flag=1;
            }
              
    if(flag==0)
      System.out.println("no duplicate elements.");
        System.out.println("-1");
    }
 }
