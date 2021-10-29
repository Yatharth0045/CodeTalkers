import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args) {
	int n=0,i=0,sum=0,lastNumber=0,temp=0;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	sc.close();
	temp = n;
	while(temp>0){
		lastNumber = temp%10;
		sum = lastNumber*lastNumber*lastNumber+sum;
		temp /= 10;
	}
	if(n==sum)
		System.out.println("YES");
	else
		System.out.println("NO");	
	}
}