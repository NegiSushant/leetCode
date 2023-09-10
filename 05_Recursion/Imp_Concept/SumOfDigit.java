import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Sum of Digit is: "+sumDigit(n));
    }
    public static int sumDigit(int n){
        if(n <= 0){
            return n;
        }
        return (n%10) + sumDigit(n/10);
    }
}
