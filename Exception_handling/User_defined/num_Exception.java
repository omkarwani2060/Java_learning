package Exception_handling.User_defined;

class InvalidSyn extends Exception {
    InvalidSyn(String msg){
        System.out.println(msg);
    }
}

public class num_Exception {
    void oper(String s) throws InvalidSyn{
        if(s == null){
            throw new InvalidSyn("The String is NUll");
        }
       else{
            System.out.println(" String :-> " + s );
        }
    }
    public static void main(String[] args) throws InvalidSyn {

        num_Exception n = new num_Exception();
        try{
            n.oper(null);
        }
        catch(InvalidSyn a){
            System.out.println(a);
        }
    }
}
