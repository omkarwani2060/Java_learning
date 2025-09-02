package pattern;
import java.util.Scanner;

//public class twelve_pattern {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=i; j<n; j++){
//                System.out.print(" ");
//            }
//            for(int k=1 ; k<=(2*i-1); k++){
//                if(k==2*i-1 || k==1 || i==n){
//                    System.out.print(i);
//                }else System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}




public class twelve_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i= 1;i<=n;i++){
            for(int j=i; j< n ;j++){
                System.out.print(" ");
            }
            for(int k = 1;k <= (2*i-1); k++){
                if(k==1 || k== (2*i-1) || i ==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

















