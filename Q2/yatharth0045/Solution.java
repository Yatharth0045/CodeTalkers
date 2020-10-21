import java.util.Scanner;

class Solution {

    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println
        fractionSum()
    }

    static void fractionSum(int num1, int den1, int num2, int den2){
        int numx=0;
        int denx=0;
        if(den1 < den2){
            if ( den2 % den1 == 0 ) {
                denx = den2;
                numx = num2 + (num1 * (den2 / den1));
                System.out 
            } else {
                denx=den1*den2;
            }
        } else {
            if ( den1 % den2 == 0) {
                denx=den1;
            } else {
                denx=den1*den2;
            }
        }
    }
}