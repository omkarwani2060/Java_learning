package Array_7;
import java.util.Scanner;

public class multiplacation {

    static void print_1(int[][] a){
        for(int i=0; i< a.length; i++){
            for(int j=0; j< a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplecation(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1 != r2){
            System.out.println("The array demension wrong");
            return;
        }
        int[][] mul = new int[r1][c2];
        for(int i=0; i< r1; i++){
            for(int j=0; j < c2; j++){
                for(int k = 0; k < c1; k++){
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        print_1(mul);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row r1: ");
        int r1 = sc.nextInt();
        System.out.println("ENter Column c1: ");
        int c1 = sc.nextInt();
        System.out.println("element Array: ");
        int[][] a = new int[r1][c1];
        for(int i=0; i< r1; i++){
            for(int j=0; j< c1; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter row r2: ");
        int r2 = sc.nextInt();
        System.out.println("ENter Column c2: ");
        int c2 = sc.nextInt();
        System.out.println("element Array: ");
        int[][] b = new int[r2][c2];
        for(int i=0; i< r2; i++){
            for(int j=0; j< c2; j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("A array: ");
        print_1(a);
        System.out.println("B array: ");
        print_1(b);
        System.out.println("Multiplecation Array: ");
        multiplecation(a,r1,c1,b,r2,c2);
    }
}
