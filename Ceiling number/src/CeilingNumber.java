import java.util.Scanner;

public class CeilingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the arr: ");
//        int arr = sc.nextInt();
        System.out.println("enter the target: ");
        int target = sc.nextInt();

        int [] arr = {-18, -12, -4, 0, 2, 4, 7, 9, 13, 15,18, 22, 23};
//        int target = 22;
        int ans = ceiling(arr, target);
        System.out.println(ans);


    }
    // return the index of the smallest no>= target

    static int ceiling(int[] arr, int target) {
        // but what if target is greater than then greatest number in the array
        if(target > arr.length - 1){
            return  -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            // find the middle element
            //int mid = (start + end)/2;
            int mid = start +(end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                // answer found
                return mid;
            }
        }
        return start;
    }
}
