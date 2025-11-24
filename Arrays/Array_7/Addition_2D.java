package Array_7;
import java.util.Scanner;

public class Addition_2D {
    static void print_1(int[][] arr){
        for(int i=0; i< arr.length; i++){
            for(int j =0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void add(int[][] a, int r1, int c1 , int[][] b, int r2, int c2){
        if( r1 != r2 || c1 != c2){
            System.out.println("The Wrong Array Dimension");
            return;
        }
        int[][] Add = new int[r1][c1];
        for( int i=0; i< r1; i++){
            for( int j = 0; j< c1; j++){
                Add[i][j] = a[i][j] + b[i][j];
            }
        }
        print_1(Add);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the Column: ");
        int c1 = sc.nextInt();
        System.out.println("Arrays element: ");
        int[][]  a = new int[r1][c1];
        for(int i =0; i< a.length; i++ ){
            for(int j =0; j< c1; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the rows: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the Column: ");
        int c2 = sc.nextInt();
        System.out.println("Arrays element: ");
        int[][]  b = new int[r2][c2];
        for(int i =0; i< r2; i++ ){
            for(int j =0; j< c2; j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix A: ");
        print_1(a);
        System.out.println("Matrix B: ");
        print_1(b);
        System.out.println("Sum : ");
        add(a, r1, c1, b, r2 , c2);
    }
}


