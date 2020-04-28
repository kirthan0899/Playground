#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int birth, cur;
  cin>>birth>>cur;
  if(cur<birth)
  {
    cur+=100;
    cout<<cur-birth;
  }
  	else
    {
      cout<<cur-birth;
    }
}