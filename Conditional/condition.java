import java.util.Scanner;
// public class condition{                             //if condition
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);       
//         System.out.println("Enter num: ");
//         int num_1 = sc.nextInt();
//         if (num_1 % 2 == 0){
//             System.out.println("Even");
//         } else{
//             System.out.println("Odd");
//         }
//     }
// }
                                                        //if-else-if Condition
// public class condition{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter age: ");
//         int age = sc.nextInt();
//         if(age < 12){
//             System.out.println("Child");
//         }else if ((age >=12)&&(age<19)) {
//             System.out.println("Teenages");
//         }else{
//             System.out.println("Adult");
//         }
//     }
// }

                                                    // nested if-else statement
// public class condition {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number: ");
//         int age = sc.nextInt();
//         if (age < 20){
//             if (age < 10){
//                 System.out.println("primary School Student");
//             }
//             else{
//                 System.out.println("College Student");
//                 }   
//         }else{
//             System.out.println("Younger man ");
//             }                    
//     }    
// }   

                                                // ternary operator
// public class condition {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         String result;
//         result = (num1 % 2 == 0) ? "Even" : "odd";
//         System.out.println(result);
//     }    
// }

                                                // even and divisible by 3
// public class condition{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num_1 = sc.nextInt();
//         if ((num_1 % 2 == 0)&&(num_1 % 3 == 0)){
//             System.out.println("Found number:"+ num_1);
//         }
//         else{
//             System.out.print("Not Found..");
//         }
//     }
//}

                                                // any one divisible by 3 and 5
// public class condition{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int no = sc.nextInt();
//         if(no%3 == 0 || no%5 == 0){
//             System.out.println("number Found: "+ no);
//         }else{
//             System.out.println("Number not Found: "+ no);
//         }
//     }
// }

                                                        //Switch statement
// public class condition{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int day = sc.nextInt();
//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("tuesday");
//                 break;
//             case 3:
//                 System.out.println("thuesday");
//                 break;
//             case 4:
//                 System.out.println("wedseday");
//                 break;
//             case 5:
//                 System.out.println("friday");
//                 break;
//             default:
//                 System.out.println("Invalid Day");
                
//         }
//     }
// }

                                                            //example
// public class condition{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = 60,y = 90;
//         if (x%y == 0){
//             System.out.println("Goood");
//         }
//         else{
//             System.out.println("BAD");
//         }
//     }
// }

public class condition{
    public static void main(String[] args) {
        int course = 3;
        switch (course) {
            case 1:
                System.out.println("Java");
                break;
            case 2:
                System.out.println("python");
                break;
            case 3:
                System.out.println("C++");
                break;
            default:
                System.out.println("SQL");
        }
    }
}


// public class condition{
//     public static void main(String[] args) {
//         double a = 7/22*(3.14+2)*3/5;
//         System.out.println(a);
//     }
// }

// public class condition{
//     public static void main(String[] args) {
//         int a = 4+2%-8;
//         System.out.println(a);
//     }
// }

// public class condition{
//     public static void main(String[] args) {
//         double a = 2/7.0;
//         System.out.println(a);
//     }
// }
