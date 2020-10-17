// Armstrong Number

// For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. Return "Yes" if it is a armstrong number else return "No".
// NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371

#include<iostream>
using namespace std;
int main()
{
  int num,temp,mod,res=0;
  cout<<"Enter the Three Digit number : ";
  cin>>num;
  temp = num;
  while (temp!= 0)
  {
      mod = temp%10;
      res += mod*mod*mod;
      temp /= 10;
  }
  if(res == num)
    cout<<"The number "<<num<<" is an Armstrong Number !!!";
  else
    cout<<"The number "<<num<<" is not an Armstrong Number !!!";
  return 0;
}