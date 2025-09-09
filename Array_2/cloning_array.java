package Array_2;

public class cloning_array {
    static void method1(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 15;
        arr[1] = 22;
        arr[2] = 32;
        arr[3] = 41;

        method1(arr);
        int[]  arr2 = arr.clone();
        method1(arr2);

        arr2[0] = 0;
        arr2[1] = 0;
        method1(arr2);
        method1(arr);

    }
}
