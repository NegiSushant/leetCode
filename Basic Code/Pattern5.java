public class Pattern5 {
    public static void main(String[] args) {
        int n = 7;
        NumberChangingPyramidPattern(n);
    }
    public static void NumberChangingPyramidPattern(int n){
        int num=1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
