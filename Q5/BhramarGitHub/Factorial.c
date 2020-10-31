#include<stdio.h>
int main(){
	int n=0,fact=1;
	scanf("%d",&n);
	while(n>1){
		fact *= n;
		n--;
	}	
	printf("%d",fact);
}
