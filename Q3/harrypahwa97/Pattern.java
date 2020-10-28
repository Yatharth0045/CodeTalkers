import java.util.Scanner;
public class Pattern {
	public static void main(String harry[]){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		s.close();
		for(int i=N;i>=1;i--){
			for(int j=N;j>=1;j--){
				for(int k=i;k>=1;k--){
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}	
	}
}