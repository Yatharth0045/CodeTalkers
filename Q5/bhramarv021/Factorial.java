import java.util.Scanner;
class Factorial{
	public static void main(String[] args) {
		int n=0,fact=1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		while(n>1){
			fact *= n;
			n--;
		}	
		System.out.println(fact);
	}
}