#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,num,x[100],count=0,i=0, y[100],a[100],b[100], rem;
  cin>>n;
  num=n;
  while(n)
  {
    count++;
    rem=n%10;
    x[i]=rem;
    i++;
    n/=10;
}
  for(int i=count-1, j=0;i>=0;i--, j++)
  {
	y[j]=x[i];
  }
  int k=0, l=0;
  for(int i=0;i<count;i++)
  {
    if(y[i]%2==0)
    {
      a[k]=y[i];
      k++;
    }
    else
    {
      b[l]=y[i];
      l++;
    }
  }
  int sum1=0;
  for(int i=0; i<k;i++)
  {
	sum1=sum1+a[i];
  }
  int sum2=0;
  for(int i=0; i<l;i++)
  {
	sum2=sum2+b[i];
  }
  if(sum1==sum2)
    cout<<"Yes";
  else
    cout<<"No";
}