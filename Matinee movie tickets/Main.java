#include<iostream>
using namespace std;

int main()
{
  //Type your code here.
  int age;
  float timings;
  cin>>age>>timings;
  if(age>13)
  {
    if(timings==10.15f || timings==18.00f  || timings==22.00f)
    {
      cout<<"$8.00";
    }
    else
    {
      cout<<"$5.00";
    }
  }
  else
  {
    if(timings==10.15f || timings==18.00f  || timings==22.00f)
    {
      cout<<"$4.00";
    }
    else
    {
      cout<<"$2.00";
    }
  }
}