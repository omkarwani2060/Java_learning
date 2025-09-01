import java.util.Scanner;                               // count the digit of number n                       

// public class part1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int Countofdigit = 0;
//         for (; n > 0; ){
//                 n = n/10;
//                 Countofdigit++;
//         }
//     System.out.println("Count of Digit: "+ Countofdigit);
//     }    
// }

                                                       
// public class part1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//     }    
// }
                                                                         //sum of  digit of a number
// public class part1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         int s = 0;
//         for (;number > 0; ){
//             s += number%10;
//             number = number/10;
//         }
//         System.out.println("Sum of digit: "+ s);
//     }    
// }  
                                                                        // while
// public class part1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int s = 0;
//         while(n>0){
//             s += n%10;
//             n = n/10;
//         }
//         System.out.println("sum of digit:" + s);
//     }    
// }
                                                            //print reverse number
// public class part1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         int reverse = 0;
//         int store = 0;
//         for (;number > 0;){             //987
//             reverse = reverse*10 +  number%10;
//             number /= 10;  
//            // reverse =reverse +10;
//            //System.out.println(store); 
//            //  reverse = reverse*10 ;
//         }
//         System.out.println("reverse number: " + reverse);
//     }    
// }
                                                                    // sum of a given series.

// public class part1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         int store = 0;
        
//         for (int n =1;n<= number;n++){
//             if (n%2==0){
//                 store -= n;
//             }
//             else{
//                 store += n;
//             }     
//         }
//      System.out.println(store);   
//         }    
// }
                                                    // print factorial number n
// public class part1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         int fact = 1;
//         for(int i = 1;i<=number; i++){
//             fact *= i;
//         }
//         System.out.println("factorial of: "+number +" = "+fact);
//     }    
// }

                                        //a and b find the raise of power of a.

public class part1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       int power = sc. nextInt();
       int store = 1;
       int i = 1;
       while(i<= power){
            store *= number;
            i++;
       }
       System.out.println(number + " power of: "+ store);
    }    
}                                        
