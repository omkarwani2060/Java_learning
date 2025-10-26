package Enum;
enum stat{
  Success(200), Error(404), Loading(102);

  private final int code;

  stat(int code){
      this.code = code;
  }

  int getval(){
      return code;
  }
}

public class Status {
    public static void main(String[] args) {
        for(stat s : stat.values()){
            System.out.println(s +" Code ->  : "+ s.getval() + "  Index : "+s.ordinal());
        }
    }
}
