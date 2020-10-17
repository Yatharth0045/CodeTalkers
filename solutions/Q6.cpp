// Perfect Number

// Given a number N, check if a number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.

// Input:
// N = 6
// Output:
// 1 
// Explanation:
// Factors of 6 are 1, 2, 3 and 6.
// Excluding 6 their sum is 6 which
// is equal to N itself. So, it's a
// Perfect Number.

#include <iostream>
using namespace std;
int main()
{
    int i, num, div, sum = 0;
    cout << "Enter the Number : ";
    cin >> num;
    for (i = 1; i < num; i++)
    {
        div = num % i;
        if (div == 0)
            sum = sum + i;
    }
    if (sum == num)
        cout << "The Number " << num << " is a Perfect Number !!!";
    else
        cout << "The number " << num << " is not a Perfect Number !!!";
    return 0;
}