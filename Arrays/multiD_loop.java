package Arrays;

class A{
    void method(){
        int arr[][] = new int[4][3];

        arr[0][0] = 12;
        arr[0][1] = 14;
        arr[0][2] = 16;

        arr[1][0] = 32;
        arr[1][1] = 24;
        arr[1][2] = 36;

        arr[2][0] = 42;
        arr[2][1] = 48;
        arr[2][2] = 54;

        arr[3][0] = 98;
        arr[3][1] = 76;
        arr[3][2] = 46;

        for(int i =0; i < arr.length; i++){
            for(int j = 0; j< arr[i].length ; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}


public class multiD_loop {

    public static void main(String[] args) {
        A obj = new A();
        obj.method();
    }
}
