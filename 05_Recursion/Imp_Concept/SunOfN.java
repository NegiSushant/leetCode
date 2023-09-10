import java.util.Scanner;

public class SunOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Sum of "+n+" is: "+sum(n));
    }

    public static int sum(int n){
        if(n <= 1){
            return 1;
        }

        return n + sum(n-1);
    }
}
