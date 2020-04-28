#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int units;
  int cost;
  cin>>units;
  if(units<=200)
  {
	cost=0.5*units;
  }
  else if(units<=400)
  {
    cost=0.65*units+100;
  }
  else if(units<=600)
  {
    cost=0.8*units+200;
  }
  else
  {
    cost=1.25*units+425;
  }
  cout<<"Rs."<<cost;
}