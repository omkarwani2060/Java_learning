package Array_5;
import java.util.Scanner;

public class sort_m2 {

    static void method(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

   static void sort(int[] arr){
        int n = arr.length;
        int i =0 , j = n-1;
        while(i<j){
            if(arr[i] == 1 && arr[j]==0){
                swap(arr,i,j);
                    i++;
                    j--;

            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
        }

   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size: ");
        int n = sc.nextInt();
        System.out.println("element of array: ");

        int[] arr = new int[n];

        for(int i= 0;i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Sorted array: ");

        sort(arr);
        method(arr);


    }
}
