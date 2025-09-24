package Array_6;
import java.util.Scanner;

public class equal_prefix_sufix {
    static void print(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static int Totalsum(int[] arr){
        int n = arr.length;
        int total = 0;
        for(int i = 0; i< arr.length; i++ ){
            total += arr[i];
        }
    return total;
    }

    static boolean equal_sufix_prefix(int[] arr){
        int n = arr.length;
        int total = Totalsum(arr);
        int prefix = 0;
        for(int i = 1; i< arr.length; i++){
            prefix += arr[i];
            int sufix = total - prefix;
            if(prefix == sufix){
                return true;
            }
        }
    return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size: ");
        int n = sc.nextInt();
        System.out.println("Array Element: ");
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] =sc.nextInt();
        }

        System.out.println("answer: "+ equal_sufix_prefix(arr));
    }
}
