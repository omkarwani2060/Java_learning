package Recursion;
                                        // print 10 star in one line //
public class Star {
    void star1(int n){
        if(n == 0){
            return ;
        }
        System.out.print('*' + " ");
        star1(n -1);
    }
    public static void main(String[] args) {
        Star obj = new Star();
        obj.star1(10);
    }
}
