#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int rem, num=n, n1=n, sum=0, count=0;
  while(n)
  {
    count++;
	n/=10;
  }
  while(n1)
  {
    rem=n1%10;
    sum+=power(rem, count);
    n1/=10;
  }
  if(sum==num)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}