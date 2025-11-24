package Array_3;
import java.util.Scanner;

public class repeted_last {

    static int method1(int[] arr){
        int n = arr.length;
        int ans = 0;
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    ans = arr[i];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        System.out.println("element of array: ");
         int[] arr = new int[n];
         for(int i=0; i<arr.length; i++){
             arr[i] = sc.nextInt();
         }

        System.out.println("The last repeted number is: "+ method1(arr));
    }
}
