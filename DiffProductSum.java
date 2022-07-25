import java.util.Scanner;

//Q-> Given an integer number n, return the difference between the product of its digits
// and the sum of its digits.
public class DiffProductSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Number: ");
        int n = sc.nextInt();
        System.out.println(subtractProductAndSum(n));

    }

    static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n > 0)
        {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;

        }
        return product - sum;
    }
}