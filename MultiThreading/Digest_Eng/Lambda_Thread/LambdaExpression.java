package MultiThreading.Digest_Eng.Lambda_Thread;


interface simple1{
    public String  getBio(String name);
}

public class LambdaExpression  {
    public static void main(String[] args) {


        simple1 s1 = new simple1() {                             // anonymous
            @Override
            public String getBio(String name) {
                return name + " is my name. ";
            }
        };
        System.out.println(s1.getBio("Ram"));



        simple1 s2 = (String name) -> {                      // Lambda Expression
            return "my name is " + name + "." ;
        };
        System.out.println(s2.getBio("Omkar"));


        Runnable task = () -> System.out.println("Hello World");
//        Thread t2 = new Thread(task);               // using Thread class
//        t2.start();
          task.run();                           // using interface implemenation

        Thread t1 = new Thread( () -> {         // Lambda expression print 0 to 10;
            for(int i=0 ; i<= 10; i++){
                System.out.println(i);
            }
        });
        t1.start();

        String a = "Omkar ";


    }
}
