import java.util.Scanner;
import java.util.*;

public class Main
{
	// Function to check if the given string is K-Palindrome or not
	public static int isKPalindrome(String X, int m, String Y, int n)
	{
		// if either string is empty, remove all characters from other string
		if (m == 0 || n == 0) {
			return n + m;
		}

		// ignore last characters of both strings if they are same
		// and recur for remaining characters
		if (X.charAt(m - 1) == Y.charAt(n - 1)) {
			return isKPalindrome(X, m - 1, Y, n - 1);
		}

		// if last character of both strings is different

		// remove last character from the first string and recur
		int x = isKPalindrome(X, m - 1, Y, n);

		// remove last character from the second string and recur
		int y = isKPalindrome(X, m, Y, n - 1);

		// consider minimum of above two operations plus one
		return 1 + Integer.min(x, y);
	}

	public static void main(String[] args)
	{
	    Scanner sc= new Scanner(System.in);  //System.in is a standard input stream  
        System.out.print("Enter a string: ");  
        String str= sc.next();   //reads string before the space  
        System.out.println("You have entered: "+str);
        System.out.println("Enter the k value: ");  
		int K=sc.nextInt();

		// get reverse of str
		String rev = new StringBuilder(str).reverse().toString();

		if (isKPalindrome(str, str.length(), rev, str.length()) <= 2 * K) {
			System.out.println("Yes the String is K-Palindrome");
		} else {
			System.out.println("No the String is not a K-Palindrome");
		}
	}
}
