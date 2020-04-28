#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int rad, len;
  cin>>rad>>len;
  int dia=rad*2;
  if(dia<=len)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
}