#include<iostream>
using namespace std;
int main()
{
  int r, c, t;
  cin>>r>>c>>t;
  int x[100][100];
  int k=1;
  for(int i=0; i<r;i++)
  {
    for(int j=0; j<r;j++)
    {
      x[i][j]=k;
      k++;
    }
  }
  /*for(int i=0; i<r;i++)
  {
    for(int j=0; j<c;j++)
    {
      cout<<" "<<x[i][j];
    }
    cout<<endl;
  }*/
  int a[100], b[100], s[100];
  for(int i=0;i<1;i++)
  {
    for(int j=0; j<c;j++)
    {
      a[j]=x[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0; j<1;j++)
    {
      b[i]=x[i][j];
    }
  }
  
  for(int i=0;i<r;i++)
  {
    for(int j=c-2; j<c;j++)
    {
      s[i]=x[i][j];
    }
  }
  int flag1=0, flag2=0, flag3=0;
  for(int i=0;i<c;i++)
  {
    if(t==a[i])
    {
      flag1=1;
      break;
    }
  }
  for(int i=0;i<r;i++)
  {
    if(t==b[i])
    {
      flag2=1;
      break;
    }
  }
  for(int i=0;i<r;i++)
  {
    if(t==s[i])
    {
      flag3=1;
      break;
    }
  }
  if(flag1==1 || flag2==1 || flag3==1)
    cout<<"Yes";
  else
    cout<<"No";
}