import java.util.Scanner;

public class ReverseNumber {
    static int sum = 0;

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//
//        //Rev1(n);
        System.out.println(Rev2(1234));
    }

    public static void Rev1(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum + 10+rem;
        Rev1(n/10);
    }

    static int Rev2(int n){
        int digit = (int)(Math.log10(n)) +1;
        return helper(n, digit);
    }

    static int helper(int n, int digit){
        if(n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digit-1)) + helper(n/10, digit-1);
    }
}
