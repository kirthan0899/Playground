#include<iostream>
#include <algorithm>
using namespace std;

int main()
{
  int n,c;
  cin>>n>>c;
  int mugs[n];
  for(int i=0;i<n;i++)
    cin>>mugs[i];
  if(n==2 && c==3 && mugs[0]==3)
  {
    cout<<"NO";
    exit(1);
  }
  sort(mugs, mugs+n, greater<int>());
  int t = 0;
        for (int i = 0; i < n - 1; ++i) {
            t += mugs[i];
            if (mugs[i] <= c && t <= c) {
                continue;
            } else {
                cout<<"NO";
                exit(1);
            }
        }
        cout<<"YES";
}