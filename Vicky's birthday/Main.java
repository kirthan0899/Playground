#include<iostream>
using namespace std;

int main()
{
  int n;
  cin>>n;
  if(n%4==0)
  {
    if(n%100==0)
    {
      if(n%400==0)
      {
        cout<<"Vicky can celebrate his birthday.";
      }
      else
      {
        cout<<"Vicky can't celebrate.";
      }
    }
     else
     {
       cout<<"Vicky can celebrate his birthday.";
     }
  }
    else
    {
      cout<<"Vicky can't celebrate.";
    }
  }