import java.util.Scanner;

class Factorial{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(factorial(scan.nextInt()));
        scan.close();
    }

    static int factorial(int number){
        int factorial=1;
        for(int i=number; i>=1; i--){
            factorial*=i;
        }
        return factorial;
    }

}