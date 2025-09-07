package Arrays;

class Array1{
    void method1(){
        int[][] arr= new int [3][4];
        int[][] arr1 = {{23,24,25},{24,34,84},{12,21,32}};

        // check the length of array
        System.out.println("length of arrays: "+ arr1.length);

        // array arr[0] -> arr[0], arr[1] , arr[2]
        System.out.println(arr1[0][0]);     //23
        System.out.println(arr1[0][1]);     //24
        System.out.println(arr1[0][2]);     //25

        // array arr[1] -> arr[0], arr[1] , arr[2]
        System.out.println(arr1[1][0]);     //24
        System.out.println(arr1[1][1]);     //34
        System.out.println(arr1[1][2]);     //84

        // array arr[2] -> arr[0], arr[1] , arr[2]
        System.out.println(arr1[2][0]);     //12
        System.out.println(arr1[2][1]);     //21
        System.out.println(arr1[2][2]);     //32

    }
}

public class multi_d {
    public static void main(String[] args) {
        Array1 a1 = new Array1();
        a1.method1();
    }
}
