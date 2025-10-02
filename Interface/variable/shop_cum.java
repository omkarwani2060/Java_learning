package Interface.variable;

interface customerraju{
    int num = 5;     // public + static +final
    void purchse();    // public + abstract
}
public class shop_cum implements customerraju{
    @Override
    public void purchse(){
        System.err.println("Raju needs "+ num + " KG rice.");
    }

    public static void main(String[] args) {
        customerraju c = new shop_cum();
        c.purchse();
    }
}
