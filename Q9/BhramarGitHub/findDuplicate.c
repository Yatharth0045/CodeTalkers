#include<stdio.h>
int main(){
	int n;
	scanf("%d",&n);
	int i,j,arr[n];

	//Taking Array values from user
	for(i=0;i<n;i++)
		scanf("%d",&arr[i]);
	
	for(i=0; i<n-1; i++){
		for (j=i+1; j<n;j++) {
			if(arr[i]==arr[j]){
				printf("%d",arr[i]);
				goto labelOne;
			}
		}
		if(i==n-2)
			printf("-1");
	}
	labelOne:
		printf(" ");
}