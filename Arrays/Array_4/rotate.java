package Array_4;
import java.util.Scanner;

public class rotate {
    static void method2(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static int[] method1(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n-k;i<n; i++){
            ans[j++] = arr[i];
        }
        for(int i = 0; i<n-k;i++){
            ans[j++] = arr[i];
        }
        return ans;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        System.out.println("Element arrays: ");
        int[] arr = new int[n];

        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array K: ");
        int k = sc.nextInt();

        int ans[] = method1(arr, k);
        method2(ans);

    }
}
