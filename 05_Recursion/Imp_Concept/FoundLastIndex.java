import java.util.Scanner;

public class FoundLastIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element in Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element: ");
        int t = sc.nextInt();

        System.out.println("Last index of target element is: "+findIndexLast(arr, t, 0));
    }

    static int findIndexLast(int[] arr, int t, int i){
        if(i == -1){
            return -1;
        }
        if(arr[i] == t){
            return i;
        }
        return findIndexLast(arr, t, i+1);
    }
}
