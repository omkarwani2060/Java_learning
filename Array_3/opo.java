package Array_3;
import java.util.Scanner;

public class opo {
    static int method1(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j =i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter The Size Of Arrays:");
      int n = sc.nextInt();
      System.out.println("Element Array: ");
      int[] arr = new int[n];

      for(int i=0; i< arr.length; i++){
          arr[i] = sc.nextInt();
      }

//      System.out.println("Target num: ");
//      int Target = sc.nextInt();

      System.out.println("The repeated number print: "+ (method1(arr)));


    }
}
