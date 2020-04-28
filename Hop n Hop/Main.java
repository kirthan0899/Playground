#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int x1=3, y1=4, x2, y2;
  cin>>x2>>y2;
  int dist;
  dist=sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
  cout << dist << endl;
}