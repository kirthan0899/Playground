#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
  char str[100];
  gets(str);
  int count=0;
  for(int i=0;str[i]!='\0';++i)
	{
		if(str[i]==' ')
			count++;
	}
  if(count>10)
    cout<<"Caption not eligible for the contest";
  else
    cout<<"Caption eligible for the contest";
}