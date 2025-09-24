package Array_2;
import java.util.Arrays;
import java.util.Scanner;

public class arraycopyofrange {

    static void method(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        method(arr);
      //  int[] arr2 = Arrays.copyOfRange(arr,1,arr.length);
        int[] arr2 = Arrays.copyOfRange(arr, 1 ,4);
        method(arr2);

        arr2[0] = 01;
        arr2[1] = 01;

        method(arr2);
        method(arr);



    }
}
