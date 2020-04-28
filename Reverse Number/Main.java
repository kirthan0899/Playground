#include <iostream>
using namespace std;

int main() 
{
	// Type your code here
  int n, rem, x[100], i=0, count=0;
  cin>>n;
  while(n>0)
  {
    count++;
	rem=n%10;
    x[i]=rem;
    i++;
    n/=10;
  }
  for(i=0;i<count;i++)
  {
    cout<<x[i];
  }
	return 0;
}