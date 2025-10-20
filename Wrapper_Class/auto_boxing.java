package Wrapper_Class;

public class auto_boxing {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;          // INTEGER AUTOBOXING
        System.out.println(b);

        byte c = 91;            //BYTE AUTOBOXING
        Byte d = c;
        System.out.println(d);

        short e = 83;           // SHORT AUTOBOXING
        Short f = e;
        System.out.println(f);

        long g = 8398439498l;       //LONG AUTOBOXING
        Long h = g;
        System.out.println(h);

        float i = 8398.89f;         // FLOAT AUTOBOXING
        Float j = i;
        System.out.println(i);

        double k = 39839839.7889287;        // DOUBLE AUTOBOXING
        Double l = k;
        System.out.println(l);

        boolean m = true;               // Boolean AutoBOXING
        Boolean n = m;
        System.out.println(n);

        char o = 'j';                   // char AutoBoxing
        Character p = o;
        System.out.println(p);
    }
}
