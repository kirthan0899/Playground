#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[n],even=0, odd=0;
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
    cin>>a[i];
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      even++;
    else
      odd++;
  }
  if(even==n)
    cout<<"The array is Even";
  else if(odd==n)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
}