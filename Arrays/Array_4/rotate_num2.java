package Array_4;
import java.util.Scanner;

public class rotate_num2 {

    static void method1(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swapping(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int j){
        while(i<j) {
            swapping( arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateinPlace(int arr[],int k){
        int n = arr.length;
        k = k % n;
        reverse( arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        System.out.println("element Array: ");
        int[] arr = new int[n];

        for(int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("K num: ");
        int k = sc.nextInt();

        rotateinPlace(arr,k);
        method1(arr);
    }
}
