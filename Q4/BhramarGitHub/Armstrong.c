#include<stdio.h>
int main(){
	int n,i,sum=0,lastNumber=0,temp=0;
	scanf("%d",&n);
	temp = n;
	while(temp){
		lastNumber = temp%10;
		sum = lastNumber*lastNumber*lastNumber+sum;
		temp /= 10;
	}
	if(n==sum)
		printf("YES");
	else
		printf("NO");
}