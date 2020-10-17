// Print the pattern

// You a given a number N. You need to print the pattern for the given value of N.
// for N=2 the pattern will be 
// 2 2 1 1
// 2 1
// for N=3 the pattern will be 
// 3 3 3 2 2 2 1 1 1
// 3 3 2 2 1 1
// 3 2 1

#include <iostream>
using namespace std;
int main()
{
    int n, i, j;
    cin >> n;
    int b = n;
    while (n > 0)
    {
        int j = 0;
        int a = b;
        while (a > 0)
        {
            cout << a << " ";
            j++;
            if (j % n == 0)
            {
                a--;
            }
        }
        cout << "\n";
        n--;
    }
    return 0;
}