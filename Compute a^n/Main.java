#include<iostream>
using namespace std;

int power(int a,int b)
{
  if(b==1)
    return a;
  else
    return a*power(a, b-1);
}
int main()
{
  //Type your code here.
  int a,n;
  cout<<"Enter the value of a"<<endl;
  cin>>a;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);
}