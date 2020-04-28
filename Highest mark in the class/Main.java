#include<iostream>
using namespace std;

int main()
{
  // Type your code here
  int n,max;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  max=a[0];
  for(int i=0;i<n;i++)
  {
    if(a[i]>max)
    {
      max=a[i];
    }
  }
  cout<<max;
}