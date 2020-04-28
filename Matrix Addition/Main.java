#include<iostream>
#include<cstdlib>
using namespace std;

int **createArray(int r, int c)
{
  int **a=(int **)malloc(r*sizeof(int*));
  for(int i=0;i<r;i++)
    *(a+i)=(int *)malloc(c*sizeof(int));
  return a;
}

int **getElement(int **a, int r, int c)
{
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>*(*(a+i)+j);
  return a;
}

void addMatrix(int **a, int **b, int r, int c)
{
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cout<<*(*(a+i)+j)+*(*(b+i)+j)<<" ";
    }
    cout<<endl;
  }
}

int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int **a=createArray(r, c);
  a=getElement(a, r, c);
  int **b=createArray(r, c);
  b=getElement(b, r, c);
  addMatrix(a, b, r, c);
}