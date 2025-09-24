package Array_7;


import java.util.Arrays;

public class arrays1 {
    public static void main(String[] args) {
        int[] arr = {1,2,18,3,5,6, 19,90,188,475};

        int max = 0;
        for(int i = 0; i< arr.length; i++){
            for(int j = 1; j  < arr.length; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
        }
        System.out.println(max);

    }
}
