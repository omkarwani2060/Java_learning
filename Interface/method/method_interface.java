                    /* method interface */

package Interface.method;

interface client{
    void webdesign();           // public + abstract
    void webdevelop();
}
abstract class rajudev implements client{
    public void webdesign(){
        System.out.println("login page,Green display, three dot switch");
    }
}

class viju extends rajudev{
    public void webdevelop(){
        System.out.println("HTML , CSS , JAVASCRIPT");
    }
}

public class method_interface {
    public static void main(String[] args) {
        client c = new viju();
        c.webdesign();     c.webdevelop();
    }
}
