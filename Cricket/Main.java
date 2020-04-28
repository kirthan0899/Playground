#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int balls, runs, runs_scored, balls_bowled;
  cin>>balls>>runs>>runs_scored>>balls_bowled;
  int overs=balls/6.0;
  int quo1=balls_bowled/6;
  int rem1=balls_bowled%6;
  float overs_finished=(float)(quo1+(rem1/10.0));
  //float overs_finished=balls_bowled/6.0;
  float current_run_rate=runs_scored/overs_finished;
  //float overs_remaining=(balls-balls_bowled)/6.0;
  int quo2=(balls-balls_bowled)/6;
  int rem2=(balls-balls_bowled)%6;
  float overs_remaining=(float)(quo2+(rem2/10.0));
  float runs_remaining=runs-runs_scored;
  float total_run_rate=(float)runs/(float)overs;
  cout<<fixed<<setprecision(1);
  cout<<overs<<endl;
  cout<<overs_finished<<endl;
  cout<<current_run_rate<<endl;
  cout<<total_run_rate<<endl;
  if(current_run_rate<total_run_rate)
    cout<<"Not Eligible to Win";
  else
    cout<<"Eligible to Win";
}