#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,number,sum=0;
  cin>>n;
  number=n;
  while(n>0)    
	{    
		m=n%10;    
		sum=sum+m;    
		n=n/10;    
	}
  if(number%sum==0)
  {
    cout<<"Harshad Number";
  }
  else
  {
	cout<<"Not Harshad Number";
  }
  
}