package Arrays;

class array{
    static void method1(){
        int[] arr = new int[5];

        arr[0] = 12;
        arr[1] = 22;
        arr[2] = 76;
        arr[3] = 34;
        arr[4] = 93;

        for(int i =0; i < 5;i++){
            System.out.println(arr[i]);
        }
    }
}

public class forarray {
    public static void main(String[] args) {
        array.method1();
    }
}
