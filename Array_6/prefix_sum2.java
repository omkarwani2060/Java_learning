package Array_6;
import java.util.Scanner;

public class prefix_sum2 {

    static void print1(int[] arr){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static int[] prefix(int[] arr){
        int n = arr.length;
        for(int i =1; i< arr.length; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size: ");
        int n = sc.nextInt();

        System.out.println("Arrays element: ");
        int[] arr = new int[n];

        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = prefix(arr);
        print1(ans);
    }
}
