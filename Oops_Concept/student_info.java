package Oops_Concept;

class mahesh_papa{
    String name = "Baburao kaka";
    int Contact_no = 93488485;
}
class karan_papa{
    String name = "Ashok Kaka";
    int Contact_no =933949283;
}
public class student_info {

     public static void main(String[] args) {
         mahesh_papa obj = new mahesh_papa();
         System.out.println("name: "+ obj.name);
         System.out.println("Contact No: "+obj.Contact_no);
         karan_papa obj2 = new karan_papa();
         System.out.println("name: "+ obj2.name);
         System.out.println("contact No: "+ obj2.Contact_no);
     }
}


