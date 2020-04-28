#include<iostream>
using namespace std;

int rep(int n)
{
  int rem=0;
  if(n<10)
  {
    
    return n;
  }
  else
    rem=n%10;
    return(rem+rep(n/10));
}
int main()
{
  int n;
  cin>>n;
  int a=rep(n);
  int b=a/10;
  int c=a%10;
  cout<<b+c;
}