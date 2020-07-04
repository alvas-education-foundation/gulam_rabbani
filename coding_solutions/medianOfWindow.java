import java.util.TreeSet; 
import java.util.Scanner;
import java.util.*;
public class median{ 

    // Pair class for the value and its index 
    static class Pair implements Comparable<Pair> { 
        private int value, index; 

        // Constructor 
        public Pair(int v, int p) 
        { 
            value = v; 
            index = p; 
        } 

        // This method will be used by the treeset to 
        // search a value by index and setting the tree 
        // nodes (left or right) 
        @Override
        public int compareTo(Pair o) 
        { 

            // Two nodes are equal only when 
            // their indices are same 
            if (index == o.index) { 
                return 0; 
            } 
            else if (value == o.value) { 
                return Integer.compare(index, o.index); 
            } 
            else { 
                return Integer.compare(value, o.value); 
            } 
        } 

        // Function to return the value 
        // of the current object 
        public int value() 
        { 
            return value; 
        } 

        // Update the value and the position 
        // for the same object to save space 
        public void renew(int v, int p) 
        { 
            value = v; 
            index = p; 
        } 

        @Override
        public String toString() 
        { 
            return String.format("(%d, %d)", value, index); 
        } 
    } 

    // Function to print the median for the current window 
    static void printMedian(TreeSet<Pair> minSet, 
                            TreeSet<Pair> maxSet, int window) 
    { 

        // If the window size is even then the 
        // median will be the average of the 
        // two middle elements 
        if (window % 2 == 0) { 
            System.out.print((minSet.last().value() 
                              + maxSet.first().value()) 
                             / 2.0); 
            System.out.print(" "); 
        } 

        // Else it will be the middle element 
        else { 
            System.out.print(minSet.size() > maxSet.size() 
                                 ? minSet.last().value() 
                                 : maxSet.first().value()); 
            System.out.print(" "); 
        } 
    } 

    // Function to find the median 
    // of every window of size k 
    static void findMedian(int arr[], int k) 
    { 
        TreeSet<Pair> minSet = new TreeSet<>(); 
        TreeSet<Pair> maxSet = new TreeSet<>(); 

        // To hold the pairs, we will keep renewing 
        // these instead of creating the new pairs 
        Pair[] windowPairs = new Pair[k]; 

        for (int i = 0; i < k; i++) { 
            windowPairs[i] = new Pair(arr[i], i); 
        } 

        // Add k/2 items to maxSet 
        for (int i = 0; i < k / 2; i++) { 
            maxSet.add(windowPairs[i]); 
        } 

        for (int i = k / 2; i < k; i++) { 

            // Below logic is to maintain the 
            // maxSet and the minSet criteria 
            if (arr[i] < maxSet.first().value()) { 
                minSet.add(windowPairs[i]); 
            } 
            else { 
                minSet.add(maxSet.pollFirst()); 
                maxSet.add(windowPairs[i]); 
            } 
        } 

        printMedian(minSet, maxSet, k); 

        for (int i = k; i < arr.length; i++) { 

            // Get the pair at the start of the window, this 
            // will reset to 0 at every k, 2k, 3k, ... 
            Pair temp = windowPairs[i % k]; 
            if (temp.value() <= minSet.last().value()) { 

                // Remove the starting pair of the window 
                minSet.remove(temp); 

                // Renew window start to new window end 
                temp.renew(arr[i], i); 

                // Below logic is to maintain the 
                // maxSet and the minSet criteria 
                if (temp.value() < maxSet.first().value()) { 
                    minSet.add(temp); 
                } 
                else { 
                    minSet.add(maxSet.pollFirst()); 
                    maxSet.add(temp); 
                } 
            } 
            else { 
                maxSet.remove(temp); 
                temp.renew(arr[i], i); 

                // Below logic is to maintain the 
                // maxSet and the minSet criteria 
                if (temp.value() > minSet.last().value()) { 
                    maxSet.add(temp); 
                } 
                else { 
                    maxSet.add(minSet.pollLast()); 
                    minSet.add(temp); 
                } 
            } 

            printMedian(minSet, maxSet, k); 
        } 
    } 

    // Driver code 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = sc.nextInt(); 
        findMedian(a, k); 
    } 
}
