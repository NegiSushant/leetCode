public class Pattern6 {
    public static void main(String[] args) {
        int n = 6;
        ZeroOneTrianglePattern(n);
    }
    public static void ZeroOneTrianglePattern(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
