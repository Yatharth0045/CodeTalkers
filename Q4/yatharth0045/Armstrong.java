import java.util.Scanner;

class Armstrong{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(isArmstrong(scan.nextInt())){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is Not Armstrong");
        }
    }

    static boolean isArmstrong(int number){
        int origNumber=number;
        int total=0;
        int digits=Integer.toString(number).length();
        while(number>=1){
            total+=Math.pow((number%10),digits);
            number/=10;
        }
        if(origNumber == total){
            return true;
        }else{
            return false;
        }
    }
}