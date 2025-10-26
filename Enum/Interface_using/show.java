package Enum.Interface_using;

interface  demo{
    String Monday = "Monday";
    String Tuesday = "Tuesday";
    String Friend = "Friend";
    String Saterday = "Satderday";
    String Sunday = "Sunday";
}
public class show {
    public static void main(String[] args) {
        System.out.println(demo.Monday);
        System.out.println(demo.Tuesday);
        System.out.println(demo.Friend);
        System.out.println(demo.Saterday);
        System.out.println(demo.Sunday);
    }
}
