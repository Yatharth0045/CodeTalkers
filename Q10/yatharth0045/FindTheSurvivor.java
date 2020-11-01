import java.util.Scanner;

class FindTheSurvivor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfPerson = scan.nextInt();
        System.out.println(findSurvivour(numberOfPerson));
    }

    static int findSurvivour(int number) {
        int i=1;
        if(number == 1){
            return 1;
        }
        while(true){
            if(Math.pow(2,i)==number){
                return 1;
            } else if(Math.pow(2,i)>number){
                break;
            }else{
                i++;
            }
        }
        i-=1;
        return (number-((int)Math.pow(2,i)))*2+1;
    }
}