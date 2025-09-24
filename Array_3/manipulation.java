package Array_3;
import java.util.Scanner;

public class manipulation {

    static void method1(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j= i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int ans = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > -1){
                ans = arr[i];
            }
        }

        System.out.println("Unique number: " + ans);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int n = sc.nextInt();
        System.out.println("Enter the element: ");

        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        method1(arr);
    }
}
