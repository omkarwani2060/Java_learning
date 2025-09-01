public class Bitwise {
    public static void main(String[] args) {
        int a = 10,b = 9;
        System.out.println("Bitwise OR:"+ (a|b));
        System.out.println("Bitwise And:"+ (a&b));
        System.out.println("Botwise Exclsive OR: " + (a^b));
        System.out.println("Bitwise complement ~: " + (~ b));
        System.out.println("Left Shift << :" + (a<<1));
        System.out.println("Right Shift >> :" + (a>>1));
    }
}

