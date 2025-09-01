import java.util.Scanner;
                                                        // binary to decimal 
// public class binary {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int binarytodecimal = sc.nextInt();
//         int store = 0;
//         int power = 1;
//         while(binarytodecimal > 0){
//             int unit_num = binarytodecimal % 10;
//             store += ( power * unit_num);
//             binarytodecimal /= 10;
//             power *= 2;
//         }
//         System.out.println("Binary to Decimal Convert: " + store);
//     }    
// }

                                                                            // decimal to binary
// public class binary{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int power = 1;
//         int store = 0;
//         while (num1 > 0){
//             int parity = num1 % 2;
//             store += (power * parity);
//             power *= 10;
//             num1 /= 2;
//         }System.out.println("Decimal to Binary: " + store);
//     }
// }


public class binary {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dtb = sc.nextInt();
        int store = 0;
        int power = 1;
        while(dtb > 0){
            int unit_no = (dtb %10);
            store += (unit_no * power);
            power *=2;
            dtb /= 10;
            
         }
         System.out.println(store);
     }
}
