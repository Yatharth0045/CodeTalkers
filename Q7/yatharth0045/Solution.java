import java.util.Scanner;

class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the limit to find out primes : ");
        sieveOfEratosthenes(scan.nextInt());
        scan.close();
    }

    static void sieveOfEratosthenes(int limit) {
        System.out.print("Prime number upto "+limit+" are : ");
        int[] array = new int[limit+1];
        for (int i = 1; i < array.length; i++) {
            if (i==1){
                array[i]=1;
            } else if (array[i]==0) {
                System.out.print(i+"  ");
                for(int j=i+1; j <array.length; j++)
                {
                    if(j%i==0){
                        array[j]=1;
                    }
                }
            } 
        }
        System.out.println();
    }
}