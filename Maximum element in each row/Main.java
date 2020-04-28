#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[10][10],n,m,max[10];
  cin>>m>>n;
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
		cin>>a[i][j];
    }
  }
  for(int i=0;i<m;i++)
  {
    max[i]=a[i][0];
  }
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(a[i][j]>max[i])
      {
        max[i]=a[i][j];
      }
    }
  }
  
  for(int i=0;i<m;i++)
  {
    cout<<max[i]<<endl;
  }
}