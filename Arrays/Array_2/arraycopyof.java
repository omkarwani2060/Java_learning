package Array_2;
import java.util.Arrays;
import java.util.Scanner;

public class arraycopyof {
    static void method1(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY:");
        int n = sc.nextInt();

        System.out.println("Enter the Element of array: ");
        int[] arr = new int[n];
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        method1(arr);
        int[] arr2 = Arrays.copyOf(arr, arr.length);

        method1(arr2);

        arr2[0] = 0;
        arr2[1] = 0;

        method1(arr2);
        method1(arr);

    }

}
