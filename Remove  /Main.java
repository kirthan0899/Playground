#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  getline(cin, str);
  string word="the";
  
  int p = -1; 
  
        // To cover the case 
        // if the word is at the 
        // beginning of the string 
        // or anywhere in the middle 
        string tempWord = word + " "; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
  
        // To cover the edge case 
        // if the word is at the 
        // end of the string 
        tempWord = " " + word; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), "");  
  
    // Return the resultant string 
    cout<<str;
}