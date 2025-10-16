package String;

public class copy_sb {

    public static void main(String[] args) {
        long startTime, endTime;

        // Using String
        startTime = System.currentTimeMillis();
        String str = "Java";
        for (int i = 0; i < 100000; i++) {
            str += " Programming";
        }
        endTime = System.currentTimeMillis();
        System.out.println("String Time: " + (endTime - startTime) + " ms");

        // Using StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 100000; i++) {
            sb.append(" Programming");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ms");

        // Using StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i < 100000; i++) {
            sb2.append(" Programming");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ms");
        }
    }