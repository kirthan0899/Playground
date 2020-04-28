// CPP program to find the centroid of triangle 
#include <bits/stdc++.h> 
using namespace std; 

// Driver code 
int main() 
{ 
	float x1,x2,x3,y1,y2,y3;
  	cin>>x1>>y1>>x2>>y2>>x3>>y3;

  	float x = (x1 + x2 + x3) / 3; 
    float y = (y1 + y2 + y3) / 3; 
  
	//cout << setprecision(3); 
	cout << x << endl << y<< endl;

	return 0; 
} 
