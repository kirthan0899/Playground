#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int liters, dist;
  float mileage;
  cin>>mileage>>liters>>dist;
  if((mileage*liters)<dist)
    cout<<"Cannot reach";
  else
    cout<<"Can reach";
}