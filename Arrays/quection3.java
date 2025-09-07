package Arrays;

// search the given number x in the array. if present them return the index else return -1.


public class quection3 {
        int method1(){
        int[] arr = {1,3,2,5,7,8,4,5,6,5};
        int x = 5;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        quection3 obj = new quection3();
        System.out.println("index of x is: " + obj.method1());
    }
}
