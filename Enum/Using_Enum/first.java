package Enum.Using_Enum;

enum Day{
    SUNDAY, MONDAY, TUESDAY, WENDESDAY, THUESDAY, FRIDAY, SATERDAY
}
public class first {
    public static void main(String[] args) {
        System.out.println(Day.SUNDAY);
        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WENDESDAY);
        System.out.println(Day.THUESDAY);
        System.out.println(Day.FRIDAY);
        System.out.println(Day.SATERDAY);

        //ordinal()
        Day fri = Day.FRIDAY;
        int index = fri.ordinal();
        System.out.println("INDEX Of Friday : "+index);            // index of friday

        // valueOf()
        Day sat = Day.SATERDAY;
        Day name = Day.valueOf("SATERDAY");  // The value are some to enum that return value otherwise error
        System.out.println(name);

        //values()      // the all values
        Day[] values = Day.values();
        for(Day val : values){
            System.out.print(val + "   ");
        }


    }
}
