package Array_2;

public class array_refer{

    static void method1(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = new int[5];

        // value of array
        arr[0] = 10;
        arr[1] = 83;
        arr[2] = 76;
        arr[3] = 14;
        arr[4] = 9;

        System.out.println("original array arr: ");
       method1(arr);
    // Trying to copy arr to arr_2
       int[] arr_2 = arr;
        System.out.println("copy arr_2");
        method1(arr_2);

        // Changing some value of arr_2
        arr_2[0] = 0;
        arr_2[1] = 0;
        System.out.println("original copy after changing arr_2");
        method1(arr_2);

        // the copy array are updated to upadate real array.
        System.out.println("copied array arr_2 after changing arr");
        method1(arr);


        
    }
}