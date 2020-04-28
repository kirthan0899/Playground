#include<iostream>
#include<cmath>

using namespace std;

int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int p=pow(a,b);
  if(c<=p)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}