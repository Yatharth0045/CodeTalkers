import java.util.Scanner;

class Perfect {

    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        if(isPerfect(scan.nextInt())){
            System.out.println("Number is Perfect");
        }else{
            System.out.println("Number is not Perfect");
        }
        scan.close();
    }

    static boolean isPerfect(int number){
        int sum = 0;
        for(int i=1;i<=number/2+1;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(number==sum){
            return true;
        } else{
            return false;
        }
    }
}