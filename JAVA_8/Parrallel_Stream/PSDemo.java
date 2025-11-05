package JAVA_8.Parrallel_Stream;

import java.util.List;
import java.util.stream.Stream;

public class PSDemo {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        List<Integer> s = Stream.iterate(1, x -> x+1).limit(2000).toList();
        List<Long> list = s.stream()
                .map(PSDemo::fact)
                .toList();
        long end  = System.currentTimeMillis();
        System.out.println("Time Taken with Sequencial Stream : "+(end -start)+"ms.");

        start = System.currentTimeMillis();
        List<Long> list1 = s.parallelStream().map(PSDemo::fact).toList();
      //  List<Long> list2 = s.parallelStream().sequential().map(PSDemo::fact).toList();  //Convert into normal Stream
        end  = System.currentTimeMillis();
        System.out.println("Time Taken with Parallel Stream : "+(end -start)+"ms.");

    }
    public static long fact(int n){
        long fact = 1;
        for(int i=1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
}
