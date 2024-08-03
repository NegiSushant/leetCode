import java.util.Arrays;
import java.util.Scanner;

public class CodeChef {

    public static void main (String[] args){
        String w1 ="abbbzcf";
        String w2 = "babzzcz";
        System.out.println(closeStrings(w1, w2));
    }
    public static boolean closeStrings(String w1, String w2) {
        int f = 0;
        if(w1.length() != w2.length()){
            return false;
        }
        for(int i = 0; i < w1.length(); i++){
            for(int j = 0; j < w2.length(); j++){
                if(w1.charAt(i)==w2.charAt(j)){
                    f = 1;
                    break;
                }
            }
            if(f == 0){
                return false;
            }
        }
        return true;
    }
}
