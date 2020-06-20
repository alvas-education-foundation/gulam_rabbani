#include <iostream>
using namespace std;

int main()
{
    int no_of_elements, no_of_rotations, no_to_display;

    cout<<"Enter the number of elements of the array : ";
    cin >> no_of_elements;

    cout<<"Enter the number of rotations of the array : ";
    cin>>no_of_rotations;

    cout<<"Enter the number of indexes to be displayed : " ;
    cin>>no_to_display;

    int arr[no_of_elements];
    cout<<"\n Input the array elements\n";
    for(int i = 0; i < no_of_elements; i++)
    {
        cin>>arr[i];
    }

    cout<<"\nThe Array Elements are\n";

    for(int i = 0; i < no_of_elements; i++)
    {
        cout<<arr[i];
        cout<<"\t";
    }

    no_of_rotations %= no_of_elements; // Remove the number of full array rotations from k

    for(int i = 0; i < no_to_display; i++)
    {
        int index;
        cout<<"\nEnter the index of the array to be displayed : ";
        cin>>index;
        cout<<"\nThe element in the array is ";
        cout<<arr[(no_of_elements + index - no_of_rotations) % no_of_elements]<<"\n"; // Calculate the new index 
    }

    return 0;
}
