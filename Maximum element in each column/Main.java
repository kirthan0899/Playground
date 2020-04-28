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
  for(int i=0;i<n;i++)
  {
    max[i]=a[0][i];
  }
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
      if(a[j][i]>max[i])
      {
        max[i]=a[j][i];
      }
    }
  }
  
  for(int i=0;i<n;i++)
  {
    cout<<max[i]<<endl;
  }
}