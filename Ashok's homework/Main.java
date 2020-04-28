#include<iostream>
using namespace std;

int main()
{
    // Type your code here
  int r,c ;
  cin>>r>>c;
  
  int m1[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>m1[i][j];
  
  int m2[r][c];
  for(int i=0; i<r;i++)
    for(int j=0;j<c;j++)
      cin>>m2[i][j];
  
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cout<<m1[i][j]+m2[i][j]<<" ";
    }
    cout<<endl;
  }
}