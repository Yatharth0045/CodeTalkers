import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input array size: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Input array elements: ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(maxWater(arr));
    }

    private static int maxWater(int[] arr) {
        int maxWater=0;
        int max=arr[0];
        int temp=0;
        System.out.println("Solution");
        for(int i = 1;i < arr.length ; i++){
            System.out.println("temp : "+temp);
            System.out.println("max= : "+maxWater);
            if(arr[i]<max && arr[i]<arr[i-1]){
                temp=temp+(max-arr[i]);
            }else if(arr[i]<max && arr[i]>arr[i-1]){
                temp=temp+(max-arr[i]);
                maxWater=maxWater+(arr[i]-arr[i-1]);
                temp=temp-(arr[i]-arr[i-1]);
            }else{
                max=arr[i];
                maxWater+=temp;
                temp=0;
            }
        }
        return maxWater;
    }
}
