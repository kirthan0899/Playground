#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  int vowels=0, consonants=0, white=0, digits=0, symbols=0;
  getline(cin, s);
  for(int i=0;i<s.size();i++)
  {
    if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u'
       || s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U')
      vowels++;
    else if((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i] <= 'Z'))
      consonants++;
    else if(s[i] >= '0' && s[i] <= '9')
      digits++;
    else if(s[i]==' ')
      white++;
    else
      symbols++;
  }
  cout<<"Vowels:"<<vowels<<endl;
  cout<<"Consonants:"<<consonants<<endl;
  cout<<"White Spaces:"<<white<<endl;
  cout<<"Digits:"<<digits<<endl;
  cout<<"Symbols:"<<symbols<<endl;
}