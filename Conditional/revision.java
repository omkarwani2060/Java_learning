import java.util.Scanner;
// Q .1

// public class revision {                                                         //leap year program
//     public static void main(String[] args) {
//         int year = 2070;
//         if (year % 4 == 0){
//             System.out.println("this year is leap year."+ year);
//         }else{
//             System.out.println("not leap year.");
//         }
//     }
// }

// Q. 2

// public class revision {
//     public static void main(String[] args) {
//         int value = -54;
//         if(value <0){
//             System.out.println("number: "+ value*(-1));
//         }
//     }
// }

// Q 3              profit & loss

// public class revision {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter cost price: ");
//         int cp = sc.nextInt();
//         System.out.print("enter selling price: ");
//         int sp = sc.nextInt();
//         if (sp < cp){
//             System.out.println("Loss: " + ( cp - sp));
//         }
//         else{
//             System.out.println("Profit: " + ( sp - cp));
//         }
//     }    
// }

// Q 4

// public class revision {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter length: ");
//         int b = sc.nextInt();
//         System.out.println("Enter length: ");
//         int a = sc.nextInt();
//         int area = a * b;
//         int parameter = 2*(a+b);
//         System.out.println("area: "+ area +"parameter: " + parameter);

//         if ( (b ==a) && (area > parameter)){
//             System.out.println("rectangle is area large" );
//         }
//         else{
//             System.out.println("parameter is large...");
//         }
//     }    
// }
                                                                            //vowel & consonant;
// public class revision{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number: ");
//         char value  = sc.next().charAt(0);
//         if(value == 'a' || value=='e' || value== 'i' || value=='o' || value =='u'){
//         System.out.println("enter char is vowel");
//         }else{
//             System.out.println("enter char is constatnt");
//         }        
//     }
// }

// public class revision {                                          // number 3 digit or not
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter number:");
//     int number1 = sc.nextInt();
//     if((number1 >= 100) && (number1 <=999)){
//         System.out.println("this number is 3 Digit");
//     }
//     else{
//         System.out.println("not 3 digit");
//     }}
// }
  
// public class revision {                                          // number 3 and 5 divisible
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter number:");
//     int number1 = sc.nextInt();
//     if((number1%3 == 0) || (number1% 5 == 0)){
//         System.out.println("Divisible.");
//     }
//     else{
//         System.out.println("not Divisible");
//     }}
// }

                                                                //greater than 3 number.
// public class revision {                                          // number 3 and 5 divisible
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter number:");
//     int number1 = sc.nextInt();
//     System.out.print("Enter number:");
//     int number2 = sc.nextInt();
//     System.out.print("Enter number:");
//     int number3 = sc.nextInt();
//     if(number1 > number2 && number1 > number3){
//         System.out.println(number1 + "--is big.");
//     }else if(number2 > number3 && number2 > number1){
//         System.out.println(number2 + "-- is big");
//     }else {
//         System.out.println(number3 + "-- is big");
//         }
//     }
// } 

// public class revision {                                         // child print 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Ram Age: ");
//         int age1 = sc.nextInt();
//         System.out.println("Sham Age:");
//         int age2 = sc.nextInt();
//         System.out.println("Ajay age:");
//         int age3 = sc.nextInt();
//         if(age1<age2 && age1 <age3){
//             System.out.println("Ram is Child.");
//         }else if(age2<age3 && age2<age1){
//             System.out.println("Sham is Child.");
//         }else{
//             System.out.println("Ajay is Child.");
//         }    
//     }    
// }

                                                    //side of triangle
// public class revision {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("First Side: ");
//         int a = sc.nextInt();
//         System.out.println("Second Side: ");
//         int b = sc.nextInt();
//         System.out.println("Third Side: ");
//         int c = sc.nextInt();
//         if(a+b>c && b+c>a && c+a>b){
//             System.out.println("this is trangle");
//         }else{
//             System.out.println("this is not trangle");
//         }
//     }    
// }

                                                          // the number 5 and 3 is dividide but 15 not dividide  
// public class revision{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number: ");
//         int number = sc.nextInt();
//         if(number%15 == 0 && (number%3 == 0 || number%5==0)){
//             System.out.println("the number is 5 and 3 is Divisible but 15 not divisible");
//         }
//         else{
//             System.out.println("Not matching the Condition.");
//         }
//     }
// }

                                                //3 number of gratest number
// public class revision{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number1:");
//         int number1 = sc.nextInt();
//         System.out.println("enter Number2:");
//         int number2 = sc.nextInt();
//         System.out.println("enter Number3:");
//         int number3 = sc.nextInt();
//         if(number1 > number2){
//             if (number1 > number3) {
//                 System.out.println("number1 is grater:: " + number1);
//             }else{
//                 System.out.println("Number1 is greater: " + number3);
//             }
//         }else{
//             if(number2 > number3){
//                 System.out.println("Number2 is greater: " + number2);
//             }else{
//                 System.out.println("Number3 is greater: " + number3);
//             }
//         }
//     }
// }
                                                
                                                    // Threepointsingleline
// public class revision {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         double x1 = 1,x2 = 2, x3 = 3, y1=1 , y2 =2 , y3= 3;
//         double m1 = (y2-y1)/(x2-x1);
//         double m2 = (y3-y2)/(x3-x2);
//         if(m1 ==m2){
//             System.out.println("The Single line");
//         }else{
//             System.out.println("Not Single line");
//         }
//     }    
// }
                                                        // value are under the cicle or behind print
// public class revision {
//     public static void main(String[] args) {
//         double x = 3,y =2 ,x2= 3,y2 = 1, m= 5;
//         double OA = ((x-y)+(x2-y2))*2;
//         double r = m*2;
//         if (r == OA){
//             System.out.println("this point is lie in line");
//         }else if (r > OA) {
//             System.out.println("this point is lie in under the circle.");
//         }else if (r < OA){
//             System.out.println("this point is lie in behind the circle.");
//         }
//     }    
// }
                                                                    //mcq Q1
// public class revision {
//     public static void main(String[] args) {
//         int x = 3,y = 5;
//         if(x==3)
//             System.out.println(x);
//         else;
//             System.out.println(y);
//     }    
// }
                                                // Q. 2

// public class revision {
//     public static void main(String[] args) {
//          int a = 3,b;
//          boolean c;
//          b=a=15;
//          c=a<15;
//          System.out.println("a="+a+"b="+b+"c="+c);        
//      }    
//  }

                                                // Q. 3
public class revision {
    public static void main(String[] args) {
         int a = 3;
        System.out.println(a!=3);
        System.out.println(a=5);
        System.out.println(a>2);               
     }    
 }
