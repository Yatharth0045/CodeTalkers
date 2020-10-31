import java.util.Scanner;
import java.util.Arrays;

class Duplicate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for( int i = 0 ; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr){
        System.out.println(Arrays.toString(arr));
        for(int i =0 ; i < arr.length ; i++){
            if( arr[Math.abs(arr[i])] < 0 ){
                return Math.abs(arr[i]);
            }else {
                arr[Math.abs(arr[i])]*=-1;
            }
        }
        return -1;
    }
}