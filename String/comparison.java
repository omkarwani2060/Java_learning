package String;

public class comparison {
    public static void main(String[] args) {
        String a = "omakr";
        String b = "omakr";
        System.out.println(a ==  b);     // (==) this operator use for comapare the memory location of two strings

        String c = new String("omkar");
        System.out.println(a == c); // (==) string memory are deffirent answer are false.

        System.out.println(a .equals(b));   // the check the content of two string.
    }
}
