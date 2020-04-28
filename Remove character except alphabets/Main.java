#include<iostream>
#include<string>
using namespace std;

void remove(string s)
{
  for(int i=0;i<s.size();i++)
  {
    if(s[i] < 'A' || s[i] > 'Z' && 
            s[i] < 'a' || s[i] > 'z')
    {
      s.erase(i,1);
      i--;
    }
  }
  cout<<s;
}
int main()
{
  //Type your code here.
  string s;
  getline(cin, s);
  remove(s);
}