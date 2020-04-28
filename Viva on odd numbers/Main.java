#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,x[10],i=0,k=0;
  float score=0.0;
  while(k<3)
  {
    cin>>n;
    x[i]=n;
    if(x[i]<0)
    {
      score-=1.0;
      break;
    }
    else if(x[i]%2==0)
    {
      score-=0.5;
    }
    else
    {
      score+=1.0;
      k++;
    }
    i++;
  }
  cout<<score;
}