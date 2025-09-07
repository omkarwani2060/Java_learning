package Arrays;
// calculate the max vaue of the element in the array.
public class quection2 {
    void method(){
        int[] arr = {1,5,12,100,3,1,9};
        int a = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > a){
                a = arr[i];
            }
        }
        System.out.println("max : "+  a);
    }

    public static void main(String[] args) {
        quection2 obj = new quection2();
        obj.method();
    }
}
