#include<iostream>
using namespace std;

int find_second(int a, int b, int c)
{
    if (a > b) {
        if (c > a)
            return a;
        if (b > c)
            return b;
    } else {
        if (c > b)
            return b;
        if (a > c)
            return a;
    }
    return c;
}

int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  cout<<"The treasure is in box which has number "<<find_second(a,b,c)<<endl;
  int pro=a*b*c;
	int hcf=1;
 //Evaluate the HCF 
 for(int i=2;i<=pro;i++)
 {
  if(a%i==0 && b%i==0 && c%i==0)
  {
   hcf=i;
   break;
  }
 }
  cout<<"The code to open the box is "<<hcf;
}