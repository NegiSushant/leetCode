public class Pattern2 {
    public static void main(String[] args) {
        int n = 6;
        NumberTriangle(n);
    }
    public static void NumberTriangle(int n){
        for(int i = 1; i < n; i++){
            for(int j = 1; j < n - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
