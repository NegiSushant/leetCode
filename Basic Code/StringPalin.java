import java.util.Scanner;

public class StringPalin {
    //by comparing rev of string
    public static boolean isPalindrome(String str1){

        String rev = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            rev += str1.charAt(i);
        }
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != rev.charAt(i)){
                return false;
            }
        }
        return true;
    }

    //Two pointer approach
    public static boolean isPalindrome1(String str){
        int s = 0, e = str.length() - 1;

        while (s < e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    //Recursive Approach
    public static boolean isPalindrome2(String str, int s, int e){
        if(s >= e){
            return true;
        }
        if(str.charAt(s) != str.charAt(e)){
            return false;
        }

        return isPalindrome2(str, s+1, e-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toLowerCase();

        System.out.println(isPalindrome2(str, 0, str.length() - 1));

        if(isPalindrome1(str)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(isPalindrome(str));
    }
}
