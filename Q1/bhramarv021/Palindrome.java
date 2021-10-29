import java.util.Scanner;
class Palindrome{
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		int reverse = findRev(n);
		if(n==reverse)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	public static int findRev(int x){
		int temp,r = 0;
		while(x>0){
			temp = x%10;
			r = r*10+temp;
			x /= 10;
		}
		return r;
	}
}