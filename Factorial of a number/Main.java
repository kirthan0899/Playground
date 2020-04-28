#include<iostream>
using namespace std;

int main(){
  // Type your code here
  int n, fact=1;
  cin>>n;
  for(int i=1; i<=n; i++)
  {
	fact*=i;
  }
  cout<<fact;
}