import java.util.Scanner;
public class SieveOfEratosthenes {
	public static void main(String harsh[]){
		Scanner s=new Scanner(System.in);
		int N = s.nextInt();
		s.close();
		int PrimeArray[]=new int[1000001];
		PrimeArray[2]=1;
		for(int i=3;i<PrimeArray.length;i+=2){
			PrimeArray[i]=1;
		}
		for(int i=3;i<PrimeArray.length;i+=2){
			if(PrimeArray[i]==0)
				continue;
			for(int j=2*i;j<PrimeArray.length;j+=i){
				PrimeArray[j]=0;
			}
		}
		for(int i=1;i<=N;i++){
			if(PrimeArray[i]==1){
				System.out.println(i+" : Prime");
			}
			else
				System.out.println(i+" : not Prime");
		}
	}
}
