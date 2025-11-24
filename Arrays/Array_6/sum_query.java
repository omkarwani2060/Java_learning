package Array_6;
import java.util.Scanner;

public class sum_query {
    static void print1(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] sum_prefix(int[] arr){
        int n = arr.length;
        for(int i=1; i< n; i++){
            arr[i] += arr[i-1];
        }
   return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Size: ");
        int n = sc.nextInt();
        System.out.print("Element of Size: ");
        int[] arr= new int[n+1];

        for(int i = 1; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = sum_prefix(arr);
        print1(ans);

        System.out.println("Query OF number: ");
        int q = sc.nextInt();
        while(q-- >0){
            System.out.println("Small Number:");
            int l = sc.nextInt();
            System.out.println("Large Number: ");
            int r = sc.nextInt();

            int answer = ans[r] - ans[l-1];
            System.out.println(answer);
        }

    }
}
