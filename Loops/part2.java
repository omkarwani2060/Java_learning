import java.util.Scanner;


// public class part2 {
//     public static void main(String[] args) {
//         for (int i = 1; i<=3; i++){
//             System.out.print("*");
//             for (int j=1; j<=5; j++){
//                 System.out.print("*");
//              }
//              System.out.println();
//         }
//     }    
// }

                                                            // upper program same output 
// public class part2{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         for(int i=1; i<=3;i++){
//             for (int j =1;j<=6;j++){
//                 System.out.println("*");
//             }
//             System.out.println("*");
//         }
//     }
// }

                                                                // q.2
// public class part2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int first = sc.nextInt();
//         int second = sc.nextInt();
        
//         for(int i=1; i<= first ; i++){
//             for (int j = 1; j<=second ; j++){
//                 if(i==1 || i==first || j==1 || j==second)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }    
// }

// public class part2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         for(int i=1;i<=a;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }  
// }

                                                    // Q.3

// public class part2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//        // int b = sc.nextInt();
//         for(int i=1;i<=a;i++){
//             for(int j=1;j<=(a+1-i);j++){
//                 System.out.print("*");                    
//             }System.out.println();
//         }
//     }    
// }
                                                    // same but program different
// public class part2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         for(int i=a;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }  
//}

                                                       // Q.4

// public class part2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int s = sc.nextInt();
//         for(int i=1;i<=s;i++){
//             for(int j=1;j<=(s-i);j++){
//                 System.out.print(" ");
//             }
//             for (int k=1;k<=(2*i-1);k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }  
//}

// public class part2 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int  a = sc.nextInt();
//         for(int i=1;i<=a;i++){
//             for (int j=1;j<=(a-i);j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k<=(2*i-1);k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }    
// }
                                                                // Q.5
// public class part2 {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int a = sc.nextInt();
//         for(int i=1;i<=a;i++){
//             for(int j=i;j<=a;j++){
//                 System.out.print(j);
//                 }
//             for (int k=1; k<=i-1;k++){                
//                 System.out.print(k);
//             }
//         System.out.println();
//         }
//     }
// }

                                                    // Q.6
// public class part2 {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for(int i=1;i<=a;i++){
//             for(int j=1;j<=b;j++){
//                 System.out.print(j);
//             }System.out.println();
//         }
//     }    
// }

                                                        //Q.7
// public class part2 {
//     public static void main(String[] args) {
//         Scanner sc=  new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for(int i=1;i<=a;i++){
//            for (int j =1;j<=b;j++){
//              if(i==1 || i==a|| j==1 || j==b){
//                 System.out.print(j);
//             }else{
//                 System.out.print(" ");
//             }
//            }  System.out.println();
//         }
//     }    
// }                        

                                                            // Q.8
// public class part2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int s = sc.nextInt();
//         int t = sc.nextInt();
//         for(int i=1;i<=s;i++){
//             for(int j=1;j<=t;j++){
//                 if((i+j)%2==0){
//                     System.out.print(1);
//                 }else{
//                     System.out.print(2);
//                 }
//             }
//             System.out.println();
//         }
//     }    
// }
                                                    //Q.9
// public class part2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         for(int i=1;i<=a;i++){
//             for( int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }  
// }
                                                    //Q.10
                                                
// public class part2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         for(int i=1;i<=a;i++){
//         for(int k = 1;k<=(a-i);k++){
//             System.out.print(" ");
//         }
//         {
//             for(int j = 1;j<=(2*i-1);j++){
//                 System.out.print(j);
//             }System.out.println();
//         }
//     }
// }    
// }

                                                    // Q.12
// public class part2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=(r-i);j++){
//                 System.out.print(" ");
//             }
//             for(int k =1;k<=i;k++){
//                 System.out.print(k);
//             }
//             for(int l=i-1;l>=1;l--){
//                 System.out.print(l);
//             }
//             System.out.println();
//         }
//     } 
// }


// public class part2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         for(int i=1;i<=a;i++){
//             for(int j=1;j<a-i;j++){
//                 System.out.print(" ");
//             }
//             System.out.print(i);
//             if(i>1 && i< a){
//                 for(int j =1;j<=2*(i-1)-1;j++){
//                     System.out.print(" ");
//                 }
//                 System.out.print(i);
//             }
//             if(i==a){
//                 for(int j=1;j<2*i-1;j++){
//                     System.out.print(i);
//                 }
//             }
//             System.out.println();            
//         }
//     }    
// }

                                               //  this code correct ans no print
// public class part2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             System.out.print(" ");
        
//             for(int j=1;j<i;j++){
//                 if(i==n || i==1)
//                 System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             for (int k=1;k<=i;k++){
//                 if(i==n || i==i)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }   
//         System.out.println();

//             }
//         }
//     }
    

// public class part2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int s = sc.nextInt();
//         int l = sc.nextInt();
//         for(int i=1;i<=s;i++){
//             for(int j=1; j<=l;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         } 
//     }    
// }


public class part2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
