#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum1=0,sum2=0;
  cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  for (int i = 0; i < n; i++) 
        sum1 = sum1 + a[i][i]; 
    // the secondary diagonal 
    for (int i = 0; i < n; i++) 
        sum2 = sum2 + a[i][n-1-i];
  if(sum1==sum2)
    cout<<"Yes";
    else
      cout<<"No";
      
}