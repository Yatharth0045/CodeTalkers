import java.util.Scanner;
import java.util.Arrays;

class Majority {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input array size: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Input array elements: ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(majorityElement(arr, arr.length));
        scan.close();
    }

    static int majorityElement(int[] arr, int n){
        Arrays.sort(arr);
     
        int count = 1, max_ele = -1,
             temp = arr[0], ele = 0,
                f = 0;
     
        for(int i = 1; i < n; i++){
            if (temp == arr[i]){
                count++;
            }
            else{
                count = 1;
                temp = arr[i];
            }
            if (max_ele < count){
                max_ele = count;
                ele = arr[i];
                if (max_ele > (n / 2))            {
                    f = 1;
                    break;
                }
            }
        }
        return (f == 1 ? ele : -1);
    }
}