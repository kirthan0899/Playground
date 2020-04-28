#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
    cin>>a[i];
  int pos,x;
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>pos;
  if(pos>n)
  {
    cout<<"Invalid Input";
    exit(1);
  }
  cout<<"Enter the value to insert"<<endl;
  cin>>x;
  n++;
  for (int i = n; i >= pos; i--) 
        a[i] = a[i - 1]; 
  
    // insert x at pos 
    a[pos - 1] = x; 
  cout<<"Array after insertion is"<<endl;
  for(int i=0;i<n;i++)
    cout<<a[i]<<endl;
}