#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int max, a, c;
  cin>>max>>a>>c;
  int adults=a*75;
  int children=c*30;
  int weight=adults+children;
  if(weight<max)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  
}