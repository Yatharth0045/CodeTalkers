// Sum of all prime numbers between 1 and N.

//Given a positive integer N, calculate the sum of all prime numbers between 1 and N(inclusive).

#include <iostream>
using namespace std;
int main()
{
    int i, j, N, prime, sum = 0;
    cout << "Enter your Limit (included in the sum if it is Prime): ";
    cin >> N;
    for (i = 2; i <= N; i++)
    {
        prime = 1;
        for (j = 2; j <= i / 2; j++)
        {
            if (i % j == 0)
            {
                prime = 0;
                break;
            }
        }
        if (prime == 1)
        {
            sum += i;
        }
    }
    cout << "sum of all Prime Number from 1 to " << N << " is : " << sum;
    return 0;
}