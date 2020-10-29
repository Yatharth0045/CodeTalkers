#include<stdio.h>
int calcRev(int x);
int main(){
	int n,temp,rev;
	scanf("%d",&n);
	rev = calcRev(n);
	if(n==rev)
		printf("YES");
	else
		printf("NO");
}

int calcRev(int x){
	int temp,r;
	while(x>0){
		temp = x%10;
		r = r*10+temp;
		x /= 10;
	}
	return r;
}