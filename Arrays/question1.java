package Arrays;

// calculate the sum of all the elements in the given.
// arr[] = {1,5,3}

class ans{
    void method(){
        int arr[] = {1,5,3,1,9};

        int a = 0;
        for(int i = 0; i< arr.length; i++){
            a += arr[i];
        }
        System.out.println("sum of array: " + a);
    }
}
public class question1 {
    public static void main(String[] args) {
     ans a = new ans();
     a.method();
    }
}
