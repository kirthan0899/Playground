#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
  struct student s1;
  gets(s1.name);
  cin>>s1.roll;
  cin>>s1.marks;
  cout<<"\nStudent Details"<<endl;
  cout<<"Name: "<<s1.name<<endl;
  cout<<"Roll: "<<s1.roll<<endl;
  cout<<"Marks: "<<s1.marks;
}