import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        System.out.println(isPalindrome(sum(scan.nextInt())));
    }

    static int sum(int number){
        int sum=0;
        while( number > 0 ){
            sum = sum + (number % 10);
            number = number / 10;
        }
        System.out.println(sum);
        return sum;
    }

    static boolean isPalindrome(int number){
        int origNumber=number;
        int reverse=0;
        while(number > 1){
            reverse = reverse * 10 + (number % 10);
            number= number / 10;
        }
        System.out.println(reverse);
        if(reverse == origNumber){
            return true;
        } else {
            return false;
        }
    }
}