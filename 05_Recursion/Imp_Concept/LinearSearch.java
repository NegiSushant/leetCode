import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element in Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element which you want search: ");
        int t = sc.nextInt();

        System.out.println("Element found at Index: "+LinearSearchRecur(arr, t, 0));
        System.out.println("Element found: "+LinearSearchRe(arr, t, 0));
    }
    static int LinearSearchRecur(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        return LinearSearchRecur(arr, target, index+1);
    }

    static boolean LinearSearchRe(int[] arr, int t, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == t || LinearSearchRe(arr, t, index+1);
    }
}
