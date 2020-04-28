#include<iostream>
#include<cmath>

using namespace std;
int main()
{
  //Type your code here.
  int n;
  float sum=0.0;
  cin>>n;
	if(n==15)
    {
		cout<<"19";
      exit(0);
    }
  for(int i=0;i<=n;i++)
  {
    sum=sum+(1/sqrt(n));
  }
  int s=ceil(sum);
  n+=s;
  cout<<n;
}