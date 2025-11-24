package Array_7;
import java.util.Scanner;

public class input_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int r = sc.nextInt();
        System.out.println("Enter Columns: ");
        int c = sc.nextInt();
        System.out.println("Element of Arrays: ");
        int[][] arr = new int[r][c];        // r*c == Total number
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i< r; i++){
            for(int j=0; j< c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
