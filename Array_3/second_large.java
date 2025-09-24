package Array_3;
import  java.util.Scanner;

public class second_large{

    static int Largenum(int[] arr){
        int n =arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static int secondLarge(int[] arr){
        int mx = Largenum(arr);
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int second_large = Largenum(arr);
        return second_large;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int n = sc.nextInt();
        System.out.println("Element of Array: ");
        int[] arr = new int[n];
         for(int i =0; i< arr.length; i++){
             arr[i] = sc.nextInt();
         }

        System.out.println("The Second Large number is: "+ secondLarge(arr));
    }
}
