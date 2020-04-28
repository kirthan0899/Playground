#include<iostream>
#include<string>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n, count=0, x[100], rem, i=0, number, count1=0, num;
  cin>>n;
  num=n;
  number=pow(n,2);
  if(n<4)
  {
	cout<<"Not a Kaprekar Number";
    exit(0);
  }
  while(n>0)
  {
	count++;
    n/=10;
  }
  while(number>0)
  {
	count1++;
    rem=number%10;
    x[i]=rem;
    i++;
    number/=10;
  }
 
  int k=count1-count;

  string k1="";
  string k2="";
  int temp;
  
  int y[100];
  for(int i=count1-1, c=0; i>=0;i--, c++)
  {
    y[c]=x[i];
	
  }
  
  
  for(int i=0; i<k;i++)
  {
    k1=k1+to_string(y[i]);
   
  }
  for(int j=k;j<count1;j++)
  {
	k2=k2+to_string(y[j]);
  }
  int n1=stoi(k1);
  int n2=stoi(k2);
  int n3=n1+n2;
  if(n3==num)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}