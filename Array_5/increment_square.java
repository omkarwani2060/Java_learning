package Array_5;
import java.util.Scanner;

public class increment_square {

    static void print1(int[] arr){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static int[] work (int[] arr){
        int n= arr.length;
        int i = 0, j=  n-1;
        int[] ans = new int[n];
        int k = 0;
        while( i <=j){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[k++] = arr[i] * arr[i];              //the same use on ans[k++]
           //     k++;
                i++;
            }
            else{
                ans[k++] = arr[j] * arr[j];
                j--;
            }
        }
        return ans;
    }

    static void reverse(int[] arr){
        int n = arr.length;
        int i = 0, j= n-1;
       while(i<j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size: ");
        int n = sc.nextInt();
        System.out.println("Array element: ");
        int[] arr= new int[n];

        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans1 = work(arr);
  //      int[] ans2 = reverse(ans1);
        reverse(ans1);
        print1(ans1);


    }
}
