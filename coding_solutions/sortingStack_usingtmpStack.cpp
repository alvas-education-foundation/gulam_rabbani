#include <bits/stdc++.h>
using namespace std;
stack<int> sort_stack(stack<int> &stack1)
{
    stack<int> stack2;
    while(!stack1.empty())
    {
        int temp = stack1.top();
        stack1.pop();
        while(!stack2.empty() && stack2.top() > temp)
        {
            stack1.push(stack2.top());
            stack2.pop();
        }
        stack2.push(temp);
    }
    return stack2;
}
int main()
{
    stack<int> stack1;
    int n;
    cout << "\nEnter the number of elements to be pushed to the stack : ";
    cin >> n;
    cout << "\nEnter the stack elements : ";
    for(int i = 0; i < n; i++)
    {
        int data;
        cin >> data;
        stack1.push(data);
    }
    stack<int> stack2 = sort_stack(stack1);
    cout <<"\nSorted Stack : ";
    while(!stack2.empty())
    {
        cout << stack2.top()<< " ";
        stack2.pop();
    }
    cout << endl;
    return 0;
}
