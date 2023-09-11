import java.util.Scanner;

public class Sorted {
    static boolean sorted(int[] arr, int index){
        if(index == arr.length -1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr, index+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the element in Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is sorted: "+sorted(arr, 0));
    }
}