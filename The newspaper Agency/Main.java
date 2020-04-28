#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,x,y,a=100,profit,sent;
  cin>>w>>x>>y;
  y=y*w;
  sent=y+100;
  profit=(w*x)-(sent);
  cout<<profit;
  
}