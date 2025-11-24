package Array_6;
import java.util.Scanner;

public class prefix_sum {

    static void print1(int[] arr){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void prefix(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for(int i=1; i< n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        print1(pref);
//      return pref;
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

        prefix(arr);

//        int[] ans = prefix(arr);
//        print1(ans);
    }
}