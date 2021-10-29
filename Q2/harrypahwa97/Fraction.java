import java.util.*;
public class Fraction {
	public static int GCD(int a,int b){
		if(b==0)
			return a;
		return GCD(b,a%b);
	}
	public static void main(String harry[]){
		Scanner s=new Scanner(System.in);
		int num1,den1,num2,den2,num,den,gcd;
		System.out.print("Enter the numerator of the 1st number : ");
		num1 = s.nextInt();
		System.out.print("Enter the denominator of the 1st number : ");
		den1 = s.nextInt();
		System.out.print("Enter the numerator of the 2nd number : ");
		num2 = s.nextInt();
		System.out.print("Enter the denominator of the 2nd number : ");
		den2 = s.nextInt();
		s.close();
		num = (num1*den2) + (num2*den1);
		den = den1 * den2;
		gcd=GCD(num,den); //for converting into lowest form
		num/=gcd;
		den/=gcd;
		System.out.print(num1+"/"+den1+" + "+num2+"/"+den2+" = "+num+"/"+den);
		s.close();
	}
}