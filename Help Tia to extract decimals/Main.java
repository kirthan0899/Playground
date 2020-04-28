#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	string fnum,str;
  	str="";
  	int found;
	getline(cin,fnum);
  	found=fnum.find(".");
  if(found==-1)
  {
    cout<<"Floating part is : ";
    exit(1);
  }
  	for(int i=found+1; fnum[i]!='\0'; i++)
      str+=fnum[i];
  	cout<<"Floating part is : "<<str;
}