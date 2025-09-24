package Array_3;
import java.util.Scanner;
import java.util.Arrays;

public class second_small {

    static int method1(int[] arr){
        int mn = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i] < mn){
                mn = arr[i];
            }
        }
        return mn;
    }

    static int method2(int[] arr){
        int mn = method1(arr);
        int n = arr.length;
        for(int i=0; i<n; i++){
            if( arr[i] == mn){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int value = method1(arr);
        return value;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arrays size: ");
        int n = sc.nextInt();
        System.out.println("arrays element: ");
        int[] arr = new int[n];
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The second Small number in Arrays: " + method2(arr));
    }
}
