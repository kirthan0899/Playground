#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, a=0, b=1, sum=0;
  cin>>n;
  while(n>2)
  {
    sum=a+b;
    a=b;
    b=sum;
    //cout<<sum<<endl;
    n--;
  }
  cout<<sum;
}