package Exception_handling.User_defined;

class Invalidnum extends Exception{
    Invalidnum (String msg){
        System.out.println(msg);
    }
}

public class odd_even {
    static void check(int num) throws Invalidnum{
        if(num % 2 == 0){
            throw new Invalidnum("This is EVEN NUMBER");
        }
        else{
            System.out.println("This is ODD NUMBER..");
        }
    }

    public static void main(String[] args) {
        try{
            check(24);
        }
        catch (Invalidnum e){
            System.out.println(e);
        }
    }
}
