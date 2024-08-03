public class Pattern8 {
    public static void main(String[] args) {
        int n = 6;
        TriangleStar(n);
    }
    public static void TriangleStar(int n){
        for (int i = 1; i <= n; i++) {
            //for space
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
