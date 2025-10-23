package Generics.bounded;

class test<T extends Number>{
    T[] arr;
    test(T [] arr){
        this.arr= arr;
    }

    double avg(){
        double sum = 0;
        for( T a : arr)
            sum += a.doubleValue();
        return sum/ arr.length;
    }
}
public class array_class {
    public static void main(String[] args) {
        Double[] arr = {1.0,2.0,3.0,4.0,5.0};
        test<Double> t1 = new test<>(arr);
        double a = t1.avg();
        System.out.println("Average array :- > "+a);

        Integer arr2[] ={1,2,3,4,5,6,7};
        test<Integer> t2 = new test<>(arr2);
        double b = t2.avg();
        System.out.println("Average array 2 :- > "+b);

    }
}
