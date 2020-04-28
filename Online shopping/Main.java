#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float fa, fd, fs, sa, sd, ss, aa, ad, as;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  float dis1=fa*(fd/100.0);
  float dis2=sa*(sd/100.0);
  float dis3=aa*(ad/100.0);
  fa=fa-dis1;
  sa=sa-dis2;
  aa=aa-dis3;
  float t1=fa+fs;
  float t2=sa+ss;
  float t3=aa+as;
  cout<<"In Flipkart Rs."<<t1<<endl;
  cout<<"In Snapdeal Rs."<<t2<<endl;
  cout<<"In Amazon Rs."<<t3<<endl;
  if(t1<=t2 && t1<=t3)
    cout<<"He will prefer Flipkart";
  else if(t2<=t1 && t2<=t3)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}