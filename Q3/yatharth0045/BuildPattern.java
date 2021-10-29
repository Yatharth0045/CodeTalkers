import java.util.Scanner;

class BuildPattern{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        pattern(scan.nextInt());
        scan.close();
    }

    static void pattern(int n){
        
        for(int k = 1;k <= n ; k++){
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1; j <= (n+1-k) ; j++){
                    System.out.print(((n+1)-i)+" ");
                }
            }
            System.out.println();
        } 
    }
}