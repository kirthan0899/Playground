#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int rem=n%10;
  int quo=n/10;
  quo=quo/10;
  quo=quo/10;
  int sum=rem+quo;
  cout<<sum<<endl;
}