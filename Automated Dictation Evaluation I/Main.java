#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string s1, s2;
  getline(cin, s1);
  getline(cin, s2);
  if(s1==s2)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}