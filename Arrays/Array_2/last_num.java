package Array_2;
import java.util.Scanner;

public class last_num {

    static void method1(int[] arr, int x){
        int a = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == x){
                a = i;
            }
        }
        System.out.println("address of the "+x+ " is "+ a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int n = sc.nextInt();


        System.out.println("Array Element: ");
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number: ");
        int x = sc.nextInt();

        method1(arr,x);
    }
}
