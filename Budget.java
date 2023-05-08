import java.util.Arrays;
import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int[] result = new int[2];

        int minDiff = Integer.MAX_VALUE;
        for (int lo = 0, hi = nums.length - 1; lo < hi; ) {
            int sum = nums[lo] + nums[hi];
            int diff = Math.abs(target - sum);
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = nums[lo];
                result[1] = nums[hi];
            }
            if (sum < target) {
                lo++;
            } else if (sum > target) {
                hi--;
            } else {
                break;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
//    static int[] sum(int[] nums, int target){
//        Arrays.sort(nums);
//        int[] result = new int[2];
//        int minDiff = Integer.MAX_VALUE;
//        for (int lo = 0, hi = nums.length - 1; lo < hi; ) {
//            int sum = nums[lo] + nums[hi];
//            int diff = Math.abs(target - sum);
//            if (diff < minDiff) {
//                minDiff = diff;
//                result[0] = nums[lo];
//                result[1] = nums[hi];
//            }
//            if (sum < target) {
//                lo++;
//            } else if (sum > target) {
//                hi--;
//            } else {
//                break;
//            }
//        }
//        return result;
//    }
}
