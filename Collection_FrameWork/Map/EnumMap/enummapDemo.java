package Collection_FrameWork.Map.EnumMap;
import java.util.*;

public class enummapDemo {
    public static void main(String[] args) {
        Map <day, String> e1 = new EnumMap<>(day.class);
        e1.put(day.Tuesday,"Walk");
        e1.put(day.Monday,"play");
        e1.put(day.Sunday,"holiday");
        e1.put(day.Saterday,"half day");
        System.out.println(e1);
        System.out.println(e1.get(day.Monday));
        System.out.println(e1.containsKey(day.Tuesday));
        System.out.println(e1.remove(day.Wedseday));
        System.out.println(e1);
        System.out.println(e1.size());

    }
    enum day{
        Monday, Tuesday, Wedseday, Friday, Saterday, Sunday
    }
}

