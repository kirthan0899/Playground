#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string s1, s2;
  getline(cin, s1);
  getline(cin, s2);
  string s3;
  for(auto i=s1.crbegin(); i<s1.crend();i++)
    s3+=*i;
  if(s3==s2)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}