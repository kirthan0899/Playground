#include<iostream>
using namespace std;

int main()
{
  // Type your code here
  int n;
  cin>>n;
  int a[n], flag=0;
  for(int i=0; i<n; i++)
  {
    cin>>a[i];
  }
  int key;
  cin>>key;
  for(int i=0;i<n;i++)
  {
    if(a[i]==key)
    {
      flag=1;
      break;
    }
  }
  if(flag==0)
  {
    cout<<"She failed";
  }
  else
  {
    cout<<"She passed her exam";
  }
}