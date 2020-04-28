#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n;
  cin>>n;
  int *ptr=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
    cin>>*(ptr+i);
  int w=0, m=0;
  for(int i=0;i<n;i++)
  {
    if(*(ptr+i)%2==0)
      w++;
    else
      m++;
  }
  cout<<m<<endl<<w;
  return 0;
}