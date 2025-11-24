package Array_6;
import java.util.Scanner;

public class prefix_sufix {
    static void print(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static int[] prefix(int[] arr){
        int n = arr.length;
        for(int i=1; i < n; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }

    static int[] suffix(int[] arr){
        int n = arr.length;
        int[] suf = new int[n];
        suf[n-1] = arr[n-1];
        for(int i=n-2; i >= 0; i--){
            suf[i] = arr[i] + suf[i+1];
        }
        return suf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size: ");
        int n = sc.nextInt();
        System.out.println("Array Element: ");
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] =sc.nextInt();
        }

        System.out.print("Suffix : ");
        int[] ans1 = suffix(arr);
        print(ans1);

        System.out.print("Prifix : ");
        int[] ans = prefix(arr);
        print(ans);
    }
}

