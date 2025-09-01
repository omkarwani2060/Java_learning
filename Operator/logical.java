


public class logical
{
    public static void main(String[] args){
        int a = 10,b = 20, c = 30;
        System.out.println((a<b) && (b<c));                 // AND operator
        System.out.println((a>b) && (b<c));

        System.out.println((a>b) || (b<c));                 // OR operator
        System.out.println((a<b) || (b>c));
        System.out.println((a>=b) || (b>c));

        System.out.println(!(a<b));                         // NOT operator
        System.out.println(!(a>c));
    } 
}





                                                        // code is single character print his String.
// Scanner sc = new Scanner(System.in);
//         System.out.println("enter charecter");
//         String name = sc.next();
//         System.out.println(name.charAt(2));