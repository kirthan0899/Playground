#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, k=0;
  cin>>n;
  cout<<n<<endl;
  while(n>1)
  {
    if(n%2==0)
    {
      n=n/2;
      cout<<n<<endl;
    }
    else
    {
      n=(3*n)+1;
      cout<<n<<endl;
    }
    k++;
  }
  cout<<k;
}