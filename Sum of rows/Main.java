#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[10][10],m,n,sum[10];
  cin>>m>>n;
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  for(int i=0;i<m;i++)
  {
    sum[i]=0;
  }
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      sum[i]+=a[i][j];
    }
  }
  for(int i=0;i<m;i++)
  {
    cout<<sum[i]<<endl;
  }
}