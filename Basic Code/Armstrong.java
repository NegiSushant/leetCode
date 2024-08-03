public class Armstrong {
    public static void main(String[] args) {
        int n = 1634;
        System.out.println(isArm(n));
    }
    public static boolean isArm(int n){
        int c = 0;
        int num = n;
        while (n > 0){
            n = n /10;
            c++;
        }
        int sum = 0;
        n = num;
        while (n > 0){
            int rem = n%10;
            sum+= Math.pow(rem, c);
            n = n / 10;
        }
        return num == sum;
    }
}
