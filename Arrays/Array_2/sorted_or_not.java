package Array_2;

import java.util.Scanner;

public class sorted_or_not {
    static void method1(int[] arr){
        boolean check = true;
        for(int i= 1; i< arr.length; i++){
            if( arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Is sorted..!");
        }else{
            System.out.println("Is sorted..NOT! ");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();

        System.out.println("Array Element: ");
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        method1(arr);

    }
}
