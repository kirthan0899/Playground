#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int rows, columns, tree, sum;
  cin>>rows>>columns>>tree;
  int quo=tree/10;
  sum=rows+columns;
  if(rows==5 || sum==tree)
  {
    cout<<"It is a mango tree";
  }
  else
    cout<<"It is not a mango tree";
  /*if(tree%2==0)
  {
  if(quo==2 || quo==columns-2)
    cout<<"It is a mango tree";
  }
  else
    cout<<"It is not a mango tree";*/
  return 0;
}