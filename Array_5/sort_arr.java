package Array_5;
import java.util.Scanner;

public class sort_arr {

    static void method(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

  static void zero_and_one(int[] arr){
        int zero = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zero++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(i < zero){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }

  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        System.out.println("Arrays Element: ");
        int[] arr = new int[n];

        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array: ");
        method(arr);

        System.out.println("First zero after one :");
        zero_and_one(arr);
        method(arr);
    }
}
