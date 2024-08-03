public class CodingNinja {
    public static int minCost(String s, String t, int a, int b) {
        int cost = 0;
        for(int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if(cs != ct) {
                int diff = Math.abs(cs - ct);
//                if(diff > 13) {
//                    diff = 26 - diff;
//                }

                if(cs == 'a' && ct == 'z') {
                    cost += b;
                } else if(cs == 'z' && ct == 'a') {
                    cost += a;
                } else {
                    cost += diff;
                }
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        String s = "khsq";
        String t = "kvwd";
        int a = 5;
        int b = 5;
        char k = 'a';
        int p = k;
        System.out.println(p);
        System.out.println(minCost(s, t, a, b));
    }
}
