import java.util.Scanner;

class LeaderCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.print("Input array elements: ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = scan.nextInt();
        }
        leaderCount(arr);
        scan.close();
    }
    static void leaderCount(int arr[]){
        int max=0;
        for(int i=arr.length-1; i>=0; i--){
            if(max < arr[i]){
                System.out.print(arr[i]+" ");
                max = arr[i];
            }
        }
    }
}