#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[10][10], row[10], col[10], m,n, maxr,maxc, indexr, indexc;
  cin>>m>>n;
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  
  for(int i=0;i<m;i++)
    row[i]=0;
  
  for(int j=0;j<n;j++)
    col[j]=0;
  
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      row[i]+=a[i][j];
    }
  }
  
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
      col[i]+=a[j][i];
    }
  }
  
  maxr=row[0];
  maxc=col[0];
  indexr=1;
  indexc=1;
  
  for(int i=0;i<m;i++)
  {
    if(row[i]>maxr)
    {
      maxr=row[i];
      indexr=i+1;
    }
  }
  
  for(int j=0;j<n;j++)
  {
    if(col[j]>maxc)
    {
      maxc=col[j];
      indexc=j+1;
    }
  }
  cout<<"Sum of rows is ";
  for(int i=0; i<n;i++)
  {
    cout<<row[i]<<" ";
  }
  cout<<endl;
  cout<<"Row "<<indexr<<" has maximum sum"<<endl;
  
  cout<<"Sum of columns is ";
  for(int j=0; j<n;j++)
  {
    cout<<col[j]<<" ";
  }
  cout<<endl;
  
  cout<<"Column "<<indexc<<" has maximum sum"<<endl;
}