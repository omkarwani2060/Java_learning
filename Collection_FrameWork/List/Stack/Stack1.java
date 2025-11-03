package Collection_FrameWork.List.Stack;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String > s1 = new Stack<>();

        s1.push("Omkar");           //add element;
        s1.push("ganu");
        s1.push("viju");
        s1.push("raj");
        s1.push("gotya");
        s1.push("mahesh");
        s1.add("dipak");                //add element
        System.out.println("Stack : "+s1);              //print all element

        System.out.println(s1.peek());        // access last element     // the print last element
        s1.pop();                              // remove last element
        s1.remove(1);                   //remove the 1 index value

        System.out.println(s1);
        System.out.println(s1.search("raj"));   //Finds position of element from top in start 1 based index
        System.out.println(s1.contains("raj"));
        System.out.println(s1.empty());             // check the stack are empty or not.

        System.out.println(s1.get(4));
    }
}
