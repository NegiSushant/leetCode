public class Code {
    public static void main(String[] args) {
        int i = 13;
        int j = 45;
        int k = 3;
        System.out.println(beautifulDays(i, j, k));

    }
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int count = 0;
        for(int l = i; l <= j; l++){
            int r = rev(l);
            int dif = Math.abs(r - l);
            if((dif % k ) == 0 || dif == 0){
                count++;
            }

        }
        return count;
    }
    static int rev(int num){
        int revs = 0;
        while(num > 0){
            int rem = num % 10;
            revs = revs * 10 + rem;
            num = num / 10;
        }
        System.out.print(revs);
        return revs;
    }
}
