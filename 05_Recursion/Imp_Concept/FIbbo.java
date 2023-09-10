import java.util.Scanner;

public class FIbbo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        System.out.println(fibbo(n));
    }

    private static int fibbo(int n) {

        if(n <= 2){
            return 1;
        }
        return fibbo(n-1 ) + fibbo(n - 2);
    }
}
