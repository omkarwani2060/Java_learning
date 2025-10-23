package Generics.Generics_example;

class pair <K,Y >{
    private K key;
    private Y value;

    pair(Y value, K key){
        this.key = key;
        this.value = value;
    }
    K get1(){
        return key;
    }
    Y get2(){
        return value;
    }
}
public class key_pair {
    public static void main(String[] args) {

        pair<String, Integer> p1 = new pair<>(1, "omkar");

        System.out.print(p1.get2() + "    ");
        System.out.println (p1.get1());

    }
}
