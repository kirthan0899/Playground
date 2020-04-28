#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float n1,n2,n3,n4,n5,n6,n7;
  float sal=0;
  cin>>n1>>n2>>n3>>n4>>n5>>n6>>n7;
  float weeks=n1+n2+n3+n4+n5+n6+n7;
  //cout<<weeks<<endl;
  sal=n1*100.0+n2*100.0+n3*100.0+n4*100.0+n5*100.0+n6*100.0+n7*100.0;
  if(n1>0.0)
  {
    sal=sal+n1*100.0*(50.0/100.0);
  }
  if(n2>8.0)
  {
    sal=sal+((n2-8.0)*15.0);
  }
  if(n3>8.0)
  {
    sal=sal+((n3-8.0)*15.0);
  }
  if(n4>8.0)
  {
    sal=sal+((n4-8.0)*15.0);
  }
  if(n5>8.0)
  {
    sal=sal+((n5-8.0)*15.0);
  }
  if(n6>8.0)
  {
    sal=sal+((n6-8.0)*15.0);
  }
  if(n7>0.0)
  {
    sal=sal+n7*100.0*(25.0/100.0);
  }
  if(weeks>40.0)
  {
    //sal=sal+((weeks-40.0)*25.0);\
    sal=sal+25.0;
  }
  cout<<sal;
}