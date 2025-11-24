package Array_5;
import java.util.Scanner;

public class even_odd {

    static void print_1(int[] arr){
        for(int i= 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static void work(int[] arr){
        int n = arr.length;
        int left = 0 , right = n-1;
        while(left < right){
            if(arr[left] % 2== 1 && arr[right] % 2 == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 == 1){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int n = sc.nextInt();
        System.out.println("Element of Arrays: ");
        int[] arr = new int[n];

        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("OUTPUT: ");

        work(arr);
        print_1(arr);
    }
}
