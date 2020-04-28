#include<iostream>
#include<cstdlib>
using namespace std;

int sumZigZag(int r, int c, int **a)
{
  int row=0, col=0, diag=0;
  for(int i=0;i<=0;i++)
  {
	for(int j=0;j<c;j++)
    {
      row+=*(*(a+i)+j);
    }
  }
  for(int i=r-1;i<=r-1;i++)
  {
    for(int j=0;j<c;j++)
    {
      col+=*(*(a+i)+j);
    }
  }
  for(int i=1;i<r-1;i++)
  {
    for(int j=0;j<c;j++)
    {
      if(i==j)
      	diag+=*(*(a+i)+j);
    }
  }
  return row+col+diag;
}
  
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int **a=(int**)malloc(r*sizeof(int*));
  for(int i=0;i<r;i++)
    *(a+i)=(int*)malloc(c*sizeof(int));
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>*(*(a+i)+j);
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<sumZigZag(r, c, a);
  
}