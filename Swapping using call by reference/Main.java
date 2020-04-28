#include<iostream>

using namespace std;
void swap(int &c, int &d)
{
  c=c+d;
  d=c-d;
  c=c-d;
}
  

int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<endl;
  swap(a,b);
  cout<<"After swapping a= "<<a<<" and b="<<b;
}