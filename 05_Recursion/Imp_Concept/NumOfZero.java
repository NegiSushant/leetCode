import java.util.Scanner;

public class NumOfZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        
        int n = sc.nextInt();
        System.out.println("NUmber of zeros in "+n+" is: "+count(n));
    }
    static int count(int n){
        return helper1(n, 0);
    }

    private static int helper1(int n, int c) {

        if(n == 0){
            return c;
        }

        int rem = n % 10;
        if(rem == 0){
            return helper1(n/10, c+1);
        }
        return helper1(n/10, c);
    }
}
