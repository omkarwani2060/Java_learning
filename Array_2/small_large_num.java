package Array_2;
import java.util.Scanner;
import java.util.Arrays;

public class small_large_num {

    static int[] method1(int[] arr){
        Arrays.sort(arr);
        int[] store = {arr[0] , arr[arr.length-1]};

        return store;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrays Size: ");
        int n = sc.nextInt();

        System.out.println("Array element: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = method1(arr);
        System.out.println("Smaller element: " + ans[0]);
        System.out.println("largest element: " + ans[1]);

    }
}
