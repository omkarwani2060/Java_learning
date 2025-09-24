package Array_4;

public class reverse{

    static int[] rever(int[] arr){
        int n = arr.length;
        int[] ans= new int[n];
        int j =0;
        for(int i=n-1; i>0; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }

    static void method1(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr ={ 1,72,82,92,1,81,91};
        method1(arr);
    }
}