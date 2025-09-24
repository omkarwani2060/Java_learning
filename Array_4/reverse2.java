package Array_4;

public class reverse2 {
    static void method1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swapping(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void rev(int[] arr){
        int i = 0 , j= arr.length-1;
        while(i<j){
            swapping( arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args){
        int[] arr = {18, 90, 100, 120, 150, 180};
        rev(arr);
        method1(arr);
    }
}
