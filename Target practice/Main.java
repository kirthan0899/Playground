#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i=0,k,count=0;
  cin>>n;
  while(i<n)
  {
    cin>>k;
    count++;
    i+=k;
  }
  cout<<"The number of turns is "<<count;
}