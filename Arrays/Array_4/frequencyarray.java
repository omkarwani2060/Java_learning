package Array_4;
import java.util.Scanner;

public class frequencyarray {

    static int[] freq(int[] arr){
        int[] freq1 = new int[1005];
        for(int i=0; i<arr.length; i++){
            freq1[arr[i]]++;
        }
        return freq1;
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Arrays elements: ");
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = freq(arr);

        System.out.println("number of Query: ");
        int k = sc.nextInt();

        while(k>0){
            System.out.println("Searching num: ");
            int search = sc.nextInt();
            if(ans[search] > 0){
                System.out.println("NUMBER IS AVAILABLE");
            }
            else{
                System.out.println("NUMEBR IS NOT");
            }
            k--;
        }

    }
}

