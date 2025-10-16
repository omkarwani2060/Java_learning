package String;

public class reverse_str_print {
    public static void main(String[] args) {
        String str = "Omkar Wani.";
        int l = str.length();
        String store = "";
        for(int i=l-1; i>=0 ; i--){
            store = store + str.charAt(i);
        }
        System.out.println(store);
    }
}
