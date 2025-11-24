package Array_4;

public class new1 {

    static void swapwithout(int a,int b){
        System.out.println("Before Swapping");
        System.out.println("A : "+ a);
        System.out.println("B : "+ b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping");
        System.out.println("A : "+ a);
        System.out.println("B : "+ b);
    }
    static void swap(int a, int b){
        System.out.println("Before Swapping");
        System.out.println("A : "+ a);
        System.out.println("B : "+ b);
         int temp ;
         temp = a;
         a = b;
         b = temp;

        System.out.println("After Swapping");
        System.out.println("A : "+ a);
        System.out.println("B : "+ b);
    }
    static void swapwithmulti(int a, int b){
        System.out.println("Before Swapping");
        System.out.println("A : "+ a);
        System.out.println("B : "+ b);
        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println("After Swapping");
        System.out.println("A : "+ a);
        System.out.println("B : "+ b);
    }


    public static void main(String[] args) {
    int[] arr = new int[2];

    int a = 12;
    int b =18;

   // swap(a,b);
    //    swapwithout(a,b);
        swapwithmulti(a,b);

    }
}
