#include<iostream>
using namespace std;

int main()
{
  // Type your code here
  int n, count=0;
  cin>>n;
  do
  {
    count++;
    n/=10;
  }while(n>0);
  cout<<count;
}