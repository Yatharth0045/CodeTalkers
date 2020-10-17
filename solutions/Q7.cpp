// Sieve of Eratosthenes

// Given a number N, calculate the prime numbers up to N using Sieve of Eratosthenes.  

// Input:
// N = 10
// Output:
// 2 3 5 7
// Explanation:
// Prime numbers less than equal to N 
// are 2 3 5 and 7.

#include <iostream> 
#include<cstring>
using namespace std; 

void sieveOfEratosthenes(int n) 
{ 
	bool prime[n+1]; 
	memset(prime, true, sizeof(prime)); 

	for (int p=2; p*p<=n; p++) 
	{ 
		if (prime[p] == true) 
		{ 
			for (int i=p*p; i<=n; i += p) 
				prime[i] = false; 
		} 
	} 
	for (int p=2; p<=n; p++) 
	if (prime[p]) 
		cout << p << " "; 
} 
int main() 
{ 
	int N;
    cout<<"Enter the Number : ";
    cin>>N; 
	cout << "Prime numbers smaller than or equal to " << N <<" are : "<< endl; 
	sieveOfEratosthenes(N); 
	return 0; 
} 
