package Arrays;

public class quection4 {
    void method1(){
        int[] arr ={1,2,4,9,2,4,5};
        int x = 4;
        int a = -1;
        for(int i = 0; i<arr.length; i++) {
            if (x == arr[i]) {
                a = i;
                break;
            }
        }
            if(a == -1){
                System.out.println("not found");
            }else{
                System.out.println("found "+x+" in Index: "+ a);
            }
    }
    public static void main(String[] args){
        quection4 obj = new quection4();
        obj.method1();
    }
}
