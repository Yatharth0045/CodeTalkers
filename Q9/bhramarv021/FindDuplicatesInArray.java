import java.util.Scanner;
class FindDuplicatesInArray{
	public static void main(String[] args) {
		int n = 0;
		System.out.println("Enter number of elements in array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arrOfElements = new int[n];
		for(int i=0; i<n; i++)
			arrOfElements[i] = sc.nextInt();
		labelOne:
		for(int i=0; i<n-1; i++){
			for (int j=i+1; j<n;j++) {
				if(arrOfElements[i]==arrOfElements[j]){
					System.out.println(arrOfElements[i]);
					break labelOne;
				}
			}
			if(i==n-2)
				System.out.println("-1");
		}
	}
}