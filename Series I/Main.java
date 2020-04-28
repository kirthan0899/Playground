#include<iostream>
#include<cmath>
using namespace std;

int main()
{
  int n,i=0;
  cin>>n;
  float a=0.5;
  while(i<n)
  {
    cout<<a<<" ";
    a=a+(pow(3,i));
      i++;
  }
}