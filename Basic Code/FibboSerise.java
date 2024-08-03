public class FibboSerise {
    static int n1 = 0, n2 = 1, n3;
    public static void fib(int num){
        if(num >= 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+" ");
            fib(num - 1);
        }
    }

    //Recursion

    public static int fibRec(int num){
        if(num <= 1){
            return num;
        }
        return fibRec(num-1) + fibRec(num-2);
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.print(0+" "+1+" ");
        fib(n - 2);
        System.out.println();
//        for (int i = 0; i <= n; i++) {
//            System.out.print(fibRec(i)+" ");
//        }
        System.out.println();
        System.out.println("nth fibo is: "+fibRec(n));
    }
}
