package Array_5;
import java.util.Arrays;

public class fumsort {
    public static void main(String[] args) {
        int[] arr = { 1,0,1,0,0,1,0,1,1,0,0};
        Arrays.sort(arr);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
