package String;

public class String_buffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("hello ");

        sb.append(" omkar");                //add text to the end
        System.out.println(sb);

        int a =sb.length();                     // length of String
        System.out.println(a);

        sb.insert(6 , "Dada");              //insert text at position
        System.out.println(sb);

        sb.replace(5,6,"hii . ");           // replace part of string
        System.out.println(sb);

        sb.delete(5,9);                                 // delete part of String
        System.out.println(sb);

        sb.reverse();                               // reverse the String
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.capacity();                                  // return current capacity
        System.out.println(sb);

        int c = sb.charAt(8);                       //return char at position
        System.out.println(c);
    }
}
