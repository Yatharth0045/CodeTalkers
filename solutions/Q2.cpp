// Add two fractions

// You are given four numbers num1, den1, num2, and den2. You need to find (num1/den1)+(num2/den2) and output the result in the form of (numx/denx). 

#include<iostream>
using namespace std;
int lcm(int a,int b){
    static int temp = 1;
    if(temp % b  == 0 && temp % a == 0)
        return temp;
    temp++;
    lcm(a,b);
    return temp;
}
int main()
{
  int num1, den1, num2,den2;
  cout<<"Enter the 1st Fraction Numerator : ";
  cin>>num1;
  cout<<"Enter the 1st Fraction Denominator : ";
  cin>>den1;
  cout<<"Enter the 2nd Fraction Numerator : ";
  cin>>num2;
  cout<<"Enter the 2nd Fraction Denominator : ";
  cin>>den2;
  int LCM = lcm(den1,den2);
  num1 = num1*(LCM/den1);
  num2 = num2*(LCM/den2);
  int resNum = num1+num2;
  cout<<"The Output is :  "<<resNum<<"/"<<LCM;
return 0;
}