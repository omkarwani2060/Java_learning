package Array_7;

public class two_D {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                    {4,3,2,9},
                    {12,43,23, 43, 1, 2, 7}
        };

        int n = arr.length;
        for(int i=0; i<n; i++){        // row
            for(int j=0; j< arr[i].length;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
