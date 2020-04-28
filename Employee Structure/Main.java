#include<iostream>
#include<limits>
using namespace std;

struct emp
{
  char name[30];
  int id;
  int age;
  char desig[100];
  float salary;
};

int main()
{
  //Type your code here.
  emp e;
  cout<<"Enter name:"<<endl;
  gets(e.name);
  cout<<"Enter ID:"<<endl;
  cin>>e.id;
  cout<<"Enter age:"<<endl;
  cin>>e.age;
  cout<<"Enter designation:"<<endl;
    std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
  gets(e.desig);
  cout<<"Enter Salary:"<<endl;
  cin>>e.salary;
  
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<e.name<<endl;
  cout<<"ID of the Employee : "<<e.id<<endl;
  cout<<"Age of the Employee : "<<e.age<<endl;
  cout<<"Designation of the Employee : "<<e.desig<<endl;
  cout<<"Salary of the Employee : "<<e.salary;
  
  
}