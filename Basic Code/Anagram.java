import java.util.*;

public class Anagram {
    public static boolean isAnagram(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();

        if(n1 != n2){
            return false;
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i = 0; i < n1; i++){
            if(c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = sc.next();
        System.out.print("Enter the second String: ");
        String s2 = sc.next();

        System.out.println(isAnagram(s1, s2));
    }
}
