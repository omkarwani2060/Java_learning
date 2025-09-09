package Array_2;
import java.util.Scanner;

public class input_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("enter " + n + " elements: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements: ");
        for(int i =0 ; i< n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
