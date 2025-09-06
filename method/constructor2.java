package method;

class people{
    String name ;
    int age ;
    people(String n,int a){
        name = n;
        age = a;
       // System.out.println("people info");
    }

}
public class constructor2 {
    public static void main(String[] args) {
        people s1 = new people("Jack",18);
        people s2 = new people("omkar",20);

        System.out.println(s1.name+" "+s1.age);
        System.out.println(s2.name+" "+s2.age);


    }
}
