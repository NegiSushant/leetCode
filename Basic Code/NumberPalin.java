import java.util.Scanner;

public class NumberPalin {

    //two pointer approach
    public static boolean isPalindrome(int n){
        int num = n;
        int rev = 0;
        while (n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n= n / 10;
        }

        return num == rev;
    }

    //Recursive approach
    public static int isPalindrome(int n, int rev){
        if(n < 10){
            return rev * 10 + n;
        }
        int last = n % 10;
        rev = rev * 10 + last;
        return isPalindrome(n/10, rev);
    }
    // String Method
    public static boolean isPalindrome3(int n){
        String str = Integer.toString(n);
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev.equals(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(isPalindrome3(n));
        System.out.println(isPalindrome(n));

        if (isPalindrome(n, 0) == n){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
