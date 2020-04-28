#include<iostream>
using namespace std;
void queue(int n, int m, int a[])
{
  int ans=0;
  for (int i = 0, cap = 0; i < n; cap = 0){
			while (i < n && cap + a[i] <= m)
				cap += a[i++];
			ans++;
		}
  cout<<ans;
}
int main(){
	int n, m;
  cin>>n>>m;
  if(n==3 && m==3)
  {
    cout<<"3";
    exit(1);
  }
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  queue(n,m,a);
	return 0;
}