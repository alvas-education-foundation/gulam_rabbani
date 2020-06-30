#include <iostream>  
using namespace std;  
  
// Function to move all zeroes at  
// the end of array  
void moveZerosToEnd(int arr[], int n)  
{  
    int j=0, temp, i; 
      
    // Traverse the array. If arr[i] is 
    // non-zero and arr[j] is zero,  
    // then swap both the element 
    for(i=0;i<n;i++) 
    { 
        if(arr[i]!=0 && arr[j]==0) 
            { 
             swap(arr[i],arr[j]); 
            } 
        if(arr[j]!=0) 
            j+=1; 
    } 
}  
  
// Function to print the array elements  
void printArray(int arr[], int n)  
{  
    for (int i = 0; i < n; i++)  
        cout << arr[i] << " ";  
}  
  
// Driver Code 
int main()  
{  
    int arr[] = {8, 9, 0, 1, 2, 0, 3};  
    int n = sizeof(arr) / sizeof(arr[0]);  
  
    cout << "Original array: ";  
    printArray(arr, n);  
  
    moveZerosToEnd(arr, n);  
  
    cout << "\nModified array: ";  
    printArray(arr, n);  
  
    return 0;  
} 
