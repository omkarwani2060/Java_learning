package String;
                                      /* String method */
public class Str_method {
    public static void main(String[] args) {

        String a ="omkara";
        String b ="MAHESH";
        System.out.println(a.toUpperCase());        // all letter convert UpperCase.

        System.out.println(b.toLowerCase());        // all letter convert LowwerCase.

        System.out.println(a.length());             // length of string

        System.out.println(a.charAt(3));            // character of specific index.

        System.out.println(a.indexOf('a'));         // find position of charaster.

        System.out.println(a.concat(" Wani"));      //join the content or string.

        String c = "Omkara";
        System.out.println(a.equalsIgnoreCase(c));      //Compares two strings, ignoring case differences.

        String d = "omkaraa";
        System.out.println(d.compareTo(a));         //Compares strings lexicographically (alphabetical order).

        String e = "     dada     ";                //removes trailing space.
        System.out.println(e.trim());

        String f ="Hello World";
        System.out.println(f.substring(3));         //start for index number.

        System.out.println(f.substring(2,8));                  //start and end index.

        System.out.println(a.replace('o','k'));     //replace character.

        String g =" i am omkar";
        System.out.println(g.contains("am"));           //check string contain sequence.

        System.out.println(g.startsWith(" i am"));      //check start string

        System.out.println(g.endsWith("ar"));           //check end string

        String m ="one,two,three";
        String[] part = m.split(",");
        for(String parts  : part){
            System.out.println(parts);
        }

        String x = "100";
        String y =  String.valueOf(x+ 50.00); // Converts other data types to string.
        System.out.println(y);
    }
}
