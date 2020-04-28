#include<iostream>
using namespace std;

int gcd(int a, int b)
{
  if(b==0)
    return a;
  else
    return gcd(b,a%b);
}
int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}