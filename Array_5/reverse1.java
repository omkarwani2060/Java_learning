package Array_5;

public class reverse1 {
    static void method(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j){

        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void rev(int[] arr){
        int i =0; int j = arr.length-1;
        while(i<j){
            swap(arr,i,j);
                i++;
                j--;
        }
    }
    static int[] rever(int[] arr){
        int j =arr.length;
        int[] ans = new int[j];
        int p = 0;

        for(int i= j-1; i>= 0; i-- ){
            ans[p++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr= {12,19,29,27,38,18,92,46,90};

//        int[] answer = rever(arr);
//        method(answer);

        int[] ans = rever(arr);
        method(ans);

    }
}
