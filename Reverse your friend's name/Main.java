#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
//Type your code here
  string str;
  getline(cin,str);
  for(auto i=str.crbegin();i<str.crend();i++)
    cout<<*i;
}