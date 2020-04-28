#include<iostream>
using namespace std;

int main()
{
int a,b,x[1000],count=0;
  cin>>a>>b;
  int sum=a+b,sum1=0;
  for(int i=1;i<sum;i++)
  {
    int j=i-1;
    for(;j<i;j++)
    {
      if(sum%i==0)
      {
        sum1=sum1+i;
      }
    }
  }
  if(sum1==sum)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}