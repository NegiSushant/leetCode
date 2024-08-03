import java.util.Scanner;

public class PrimeNum {

    //Prime number from 1 to n
    public static void RangePrime(int n){
        int flag;
        for(int i = 1; i < n; i++){
            if(i == 1) continue;
            flag = 1;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    flag = 0;
                    break;
                }
            }

            if(flag == 1){
                System.out.print(i+" ");
            }
        }
    }

    // check weather prime or not

    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

//        RangePrime(n);
        System.out.println(isPrime(n));
    }
}
