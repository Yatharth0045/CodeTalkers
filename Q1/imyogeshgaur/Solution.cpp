#include <iostream>
using namespace std;
bool PallinDrome(int num)
{
    int div = 1;
    while (num / div >= 10)
        div *= 10;
    while (num != 0)
    {
        int first = num / div;
        int last = num % 10;
        if (first != last)
            return false;
        num = (num % div) / 10;
        div = div / 100;
    }
    return true;
}
bool isPallinDrome(int sum)
{
    if (PallinDrome(sum))
        return true;
    else
        return false;
}
int main()
{
    int N, sum = 0, div = 1;
    cout << "Enter the Number : ";
    cin >> sum;
    while (N > 0)
    {
        sum += (N % 10);
        N /= 10;
    }
    if (isPallinDrome(sum))
        cout << "Pallindrome !!!";
    else
        cout << "Not a Pallindrome !!!";
    return 0;
}