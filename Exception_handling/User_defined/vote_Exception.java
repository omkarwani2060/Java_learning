package Exception_handling.User_defined;

class InvalidageException extends Exception{
    InvalidageException(String msg){
        System.out.println(msg);
    }
}
public class vote_Exception {
    static void demo(int age) throws InvalidageException{
        if(age <= 18){
            throw new InvalidageException("NOT ELIGIABLIE TO VOTING..");
        }
        else{
            System.out.println("Eligiable to votting ");
        }
    }
    public static void main(String[] args) {
        try{
            demo(15);
        }
        catch(InvalidageException e){
            System.out.println(e);
        }
    }
}
