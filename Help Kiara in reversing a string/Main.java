#include <iostream>
int main()
{
char str[100], rev[100];     
int count = 0, end, i=0;    
//Your code goes here   
  std::cin.getline(str, 100);
  while(str[i]!='\0')
  {
    count++;
    str[i++];
  }
  for(int i=0;i<=count;i++)
    rev[i]=str[count-1-i];
std::cout<<rev;
}