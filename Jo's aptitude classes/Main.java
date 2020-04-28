#include<iostream>
using namespace std;

int gcd(int n1, int n2, int n3, int s)
{
  int gcd=1;
  while(s>=1)
  {
    if(n1%s==0 && n2%s==0 && n3%s==0)
    {
      gcd=s;
      break;
    }
    s--;
  }
  return gcd;
}
int main()
{
int a,b,c,n,small=0;
  cin>>a>>b>>c>>n;
  if(a<b && a<c)
    small=a;
  else if(b<c)
    small=b;
  else
    small=c;
  if(gcd(a,b,c,small)==n)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}