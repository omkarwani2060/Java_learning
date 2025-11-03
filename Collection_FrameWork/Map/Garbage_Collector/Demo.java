package Collection_FrameWork.Map.Garbage_Collector;

public class Demo {
    private String model;
    private String mobile;

    public Demo(String model,String mobie) {
        this.model = model;
        this.mobile= mobile;
    }
    public String getmodel(){
        return model;
    }
    public String getMobile(){
        return mobile;
    }

    @Override
    public String toString() {
        return "{Model : "+model+" | Mobile : "+ mobile+" }.";
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Garbage collector called!");
//    }

    public static void main(String[] args) {
        Demo d1 = new Demo("16 pro max","IPHONE");
                                                                     // Strong Reference
        System.out.println(d1);
        d1 = null;
        System.out.println(d1);
        System.gc();



    }
}
