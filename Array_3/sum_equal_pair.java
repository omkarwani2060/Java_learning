package Array_3;
import java.util.Scanner;

public class sum_equal_pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of Array: ");
        int n = sc.nextInt();
        System.out.print("Array element: ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Target number: ");
        int target = sc.nextInt();

        sum_equal_pair obj = new sum_equal_pair();
      //  obj.method1(arr,target);

        System.out.println("target is count is: "+ (obj.method1(arr,target)));


    }

    static int method1(int[] arr, int target){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if((arr[i]+arr[j]) == target ){
                    count++;
                }
            }
        }
        return count;
    }
}



// logic is the :
//               element array:        7 3 2 5 2 4 2
//                target num :         7
//                dry_run :     7+3 == 7False  7+2 ==7F   7+5==7f  7+2==7f 7+4==7f   7+2==7f
//                               3+2==7F   3+2 ==7f    3+5==7f 3+4==7True   3+2==7f
//                               2+5==7True     2+2 ==7f    2+4==7f     2+2==7F
//                               5+2==7True     5+4==7F        5+2==7True
//                               2+4==7F    2+2==7F
//                                 4+2 == 7F
//              target count == 4