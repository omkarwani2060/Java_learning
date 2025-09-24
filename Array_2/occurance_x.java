package Array_2;

public class occurance_x {
    static void method1(int[] arr, int num){
        int a = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                a++;
            }
        }
        System.out.println("arrays element "+ num + " count: " + a);
    }
    public static void main(String[] args){
        int[] arr = new int[4];
        arr[0] = 12;
        arr[1] = 11;
        arr[2] = 12;
        arr[3] = 92;

        int num_s = 12;
        method1(arr, num_s);




    }
}
