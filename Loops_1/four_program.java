package Loops_1;
import java.util.Scanner;


//public class four_program {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        for(int i=1 ; i<=a ; i++){
//            for(int j =1;j<=b; j++) {
//                System.out.print("*");
//            }System.out.println();
//        }
//    }
//}


//public class four_program {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        for(int i =1;i<=a; i++){
//            for(int j =1; j<=b; j++){
//                if(i == 1 || i==a || j==1 || j==b){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//public class four_program {
//public static void main(String[] args) {
//    Scanner sc = new Scanner (System.in);
//    int a = sc.nextInt();
//    for(int i=1; i<=a; i++){
//        for(int j = 1; j<=i; j++){
//            System.out.print("*");
//        }
//        System.out.println();
//     }
//    }
//}

//public class four_program {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for(int i=1; i<=a; i++){
//            for(int j = i; j<=a; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//}

//public class four_program {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for(int i = 1; i<=a; i++){
//            for(int j =1; j<= (a+1-i); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//public class four_program {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for(int i=1; i<=a; i++){
//
//        }
//    }
//}


//public class four_program {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int  a = sc.nextInt();
//        for(int i = 1; i<=a; i++){
//            for(int j = 1; j<=(a-i); j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=(2*i-1); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//public class four_program {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        for(int i = 1; i <= a; i++){
//            for(int j = i; j <=a; j++){
//                System.out.print(j);
//            }
//            for(int k = 1; k <= i-1; k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }
//    }
//}

//public class four_program {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for (int i = 1; i <= a; i++) {
//            for (int j = 1; j <= a; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

//public class four_program {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        for(int i = 1; i <=a; i++){
//            for(int j =1; j <=b; j++){
//                if((i+j)%2 == 0){
//                    System.out.print(1);
//                }else {
//                    System.out.print(0);
//                }
//            }
//            System.out.println();
//        }
//    }
//}


//public class four_program {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for (int i = 1; i <= a; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

//public class four_program {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a =  sc.nextInt();
//        for(int a0 = 0; a0 <= a; a0++){
//            for(int a1 = 1; a1 <= (a-a0); a1++){
//                System.out.print(" ");
//            }
//            for(int a2 = 1; a2 <= (a0); a2++){
//                System.out.print(a2);
//            }
//            for(int a3 = a0-1; a3 > 0; a3--){
//                System.out.print(a3);
//            }
//            System.out.println();
//        }
//    }
//}



//public class four_program {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int a = input.nextInt();
//        for (int i = 1; i <= a; i++) {
//            for (int j = i; j < (a); j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2*i-1); k++) {
//                if(k == 1 || k == (2*i-1) || i==a ){
//                    System.out.print(i);
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

                                                                // binary to decimal
//public class four_program {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int store = 0;
//        int power = 1;
//        for (int i = 1; 0 < n; i++){
//            int digit = n%10;
//            store += digit * power;
//            power *= 2;
//            n/=10;
//        }
//        System.out.println(store);
//    }
//}

                                                        // decimal to binary
//public class four_program {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int store = 0;
//        int power = 1;
//        while(a>0){
//            int digit = a%2;        // 10%2 == 0        // 5%2 = 1      // 2%2 = 0
//            store += digit * power;         // 0 + 0       // 1*2          // 0 *2
//            power *= 10;                // 1*10 ==10         // 10*10           //4*2
//            a/=2;                       // 10 /2 = 5        // 5/2= 2       // 1
//        }
//        System.out.println(store);
//    }
//    }


//public class four_program {
//    int age = 18;
//    public static void main(String[] args){
//        four_program rohan = new four_program();
//        System.out.println("Rohan Age: " + rohan.age);
//    }
//}


//class one{
//    int numb = 12;
//    String name = "omkar";
//}
//public class four_program {
//    public static void main(String[] args) {
//        one on = new one();
//        System.out.println(on.name);
//        System.out.println(on.numb);
//
//        one off = new one();
//        off.name = "DADA";
//        off.numb = 13;
//        System.out.println(off.name);
//        System.out.print(off.numb);
//    }
//}

//public class four_program {
//    static void well(){
//        System.out.println("welcome coder!..");
//    }
//    public static void main(String[] args) {
//        well();
//    }
//}

//public class four_program{
//    int add(int a , int b) {
//        return a + b;
//    }
//    public static void main(String[] args) {
//        int x = 10;
//        int y = 9;
//        four_program added = new four_program();
//        System.out.println(added.add(x,y));
//    }
//}


class algebra{
    int add(int a,int b){
        int sum = a + b;
        return sum;
    }
}
public class four_program{
public static void main(String[] args) {
    algebra obj = new algebra();
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int store = obj.add(a,b);
    System.out.println(store);

    }
}
























