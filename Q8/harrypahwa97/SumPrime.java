import java.util.Scanner;
public class SumPrime {
	public static void main(String harsh[]){
		Scanner s= new Scanner(System.in);
		int N = s.nextInt();
		if(N<3){
			if(N<2)
				System.out.print("Sum of Prime Numbers till "+N+" = "+"0");
			else if(N==2)
				System.out.print("Sum of Prime Numbers till "+N+" = "+"2");
			return;
		}
		int PrimeArray[] = new int[N+1];
		PrimeArray[2]=1;
		for(int i=3;i<=PrimeArray.length;i+=2){
			PrimeArray[i]=1;
		}
		for(int i=3;i<=PrimeArray.length;i+=2){
			for(int j=2*i;j<PrimeArray.length;j+=i){
				PrimeArray[j]=0;
			}
		}
		int SumOfPrimeTillN=2;
		for(int i=3;i<=PrimeArray.length;i+=2){
			if(PrimeArray[i]==1)
				SumOfPrimeTillN+=i;
		}
		System.out.print("Sum of Prime Numbers till "+N+" = "+SumOfPrimeTillN);
	}
}
