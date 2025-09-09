package Array_2;

public class stackToheap {
    static void method1(int[] arr){
        for(int i= 0;i<arr.length;i++){
            arr[i] = 0;
        }
    }

    public static void main(String[] args){
    int[] arr = new int[4];

    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;

    method1(arr);

    for(int i = 0; i< arr.length; i++){
        System.out.println(arr[i]);
    }

    }
}
