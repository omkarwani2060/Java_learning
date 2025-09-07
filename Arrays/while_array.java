package Arrays;

public class while_array {

    static void method1(){
        float[] arr1 = new float[6];

        arr1[0] = 12.12f;
        arr1[1] = 32.2f;
        arr1[2] = 83.2f;
        arr1[3] = 98.3f;
        arr1[4] = 32.1f;
        arr1[5] = 32.2f;

        int i = 0;
        while(i<6){
            System.out.println(arr1[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        method1();
    }
}
