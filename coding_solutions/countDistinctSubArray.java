import java.util.Scanner; 
import java.util.*; 
  
public class distinct { 

    private static int atMostK(int arr[], int n, int k) 
    { 

        int count = 0; 
 
        int left = 0; 
 
        int right = 0; 

        HashMap<Integer, Integer> map = new HashMap<>(); 

        while (right < n) { 

            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1); 
 
            while (map.size() > k) { 
                map.put(arr[left], map.get(arr[left]) - 1); 
                if (map.get(arr[left]) == 0) 
                    map.remove(arr[left]); 
                left++; 
            } 
            count += right - left + 1; 
            right++; 
        } 
        return count; 
    } 

    private static int exactlyK(int arr[], int n, int k) 
    { 
        System.out.println("output is:");  
        return (atMostK(arr, n, k) - atMostK(arr, n, k - 1)); 
    } 
 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the integer k:");
        int k=sc.nextInt();
        
        System.out.print(exactlyK(arr, n, k)); 
    } 
} 

