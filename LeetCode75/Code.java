import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 5: ");
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Enter the number which Square root you want: ");
                double num1 = sc.nextDouble();
                System.out.println(sqrt(num1));
                break;
            case 2:
                System.out.println("Enter the number which power you want: ");
                int num2 = sc.nextInt();
                System.out.println("Enter the power: ");
                int pow = sc.nextInt();
                System.out.println(power(num2, pow));
                break;

            case 3:
                System.out.println("Enter number which facter you want: ");
                int num3 = sc.nextInt();
                System.out.println(fact(num3));
                break;

            case 4:
                System.out.println("Enter the power of two: ");
                int num4 = sc.nextInt();
                System.out.println(poweroftwo(num4));
                break;

            case 5:
                System.out.println("Enter the number: ");
                int num5 = sc.nextInt();
                System.out.println("Enter the base of number: ");
                int b = sc.nextInt();
                System.out.println(Logn(num5, b));
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
        // int num = sc.nextInt();

    }

    static int fact(int num){
        if(num == 1){
            return 1;
        }
        return num * fact(num - 1);
    }

    static int power(int num, int n){
        int p = 1;
        for(int i = n; i >=1; i--){
            p = p*num;
        }
        return p;
    }

    static int poweroftwo(int n){
        int p = 1;
        for(int i = n; i >=1; i--){
            p = p*2;
        }
        return p;
    }

    static double sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n/x));

            if (Math.abs(root - x) < 0.5) {
                break;
            }

            x = root;
        }
        return root;
    }

    static int Logn(int num, int base){
        return (num > base - 1) ? 1 + Logn(num / base, base) : 0;
    }
}
