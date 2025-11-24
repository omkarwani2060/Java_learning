package Array_3;
import java.util.Scanner;

public class triplate_equal_target {
    static int method1(int[] arr, int target){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                for(int k =j+1; k<arr.length; k++){
                    if ((arr[i] + arr[j] + arr[k] == target)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        System.out.println("Element array: ");
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Target value: ");
        int target = sc.nextInt();

        triplate_equal_target obj = new triplate_equal_target();
        obj.method1(arr,target);
        System.out.println("target count : " + obj.method1(arr,target));



    }
}
