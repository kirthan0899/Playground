#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int items;
  float heat;
  cin>>items>>heat;
  if(items==1)
    cout<<heat;
  else if(items==2)
    cout<<heat+(heat*(50.0/100.0));
  else if(items==3)
    cout<<heat*2;
  else
    cout<< "Number of items is more";
}