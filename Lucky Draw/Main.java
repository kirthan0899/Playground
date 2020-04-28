#include<iostream>
#include<cmath>
using namespace std;

int main()
{
int n, flag=0, num;
  cin>>n;
  if(n==1)
  {
    cout<<"Not eligible";
    exit(0);
  }
 	num=n;
  int i=2;
  while(i<n/2)
  {
     if(num%i==0)
     {
       flag=1;
       break;
     }
    i++;
  }
  if(flag==0)
	cout<<"Eligible";
  else
    cout<<"Not eligible";
}