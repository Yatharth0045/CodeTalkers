// Factorial

// Given a positive integer, N. Find the factorial of N.

#include<iostream>
using namespace std;
int factorial(int n){
    if((n==0)||(n==1))
        return 1;
    else 
        return n*factorial(n-1);
}
int main()
{
  int num,i;
  cout<<"Enter the Number : ";
  cin>>num;
  cout<<"The factorial of "<<num<<" is : "<<factorial(num);
return 0;
}