import java.util.Scanner;

class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the limit to find out the sum of primes : ");
        System.out.println("Sum is : "+sumOfPrimes(scan.nextInt()));
    }

    static int sumOfPrimes(int limit) {
        int[] array = new int[limit+1];
        int sum=0;
        for (int i = 1; i < array.length; i++) {
            if (i==1){
                array[i]=1;
            } else if (array[i]==0) {
                sum+=i;
                for(int j=i+1; j <array.length; j++)
                {
                    if(j%i==0){
                        array[j]=1;
                    }
                }
            } 
        }
        return sum;
    }
}