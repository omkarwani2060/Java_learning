package Oops_Concept;

class use{

    private String name;
    private int age = 987;

    public int getAge(){
        return age;
    }
                                    // getter
    public String getName(){
        return name;
    }
                                        //setter
    public void setName(String name){
        this.name = name;
    }

}
public  class getter_setter {
    public static void main(String[] args) {
        use u1 = new use();
        u1.setName("Omkar");
        System.out.println(u1.getName());
        System.out.println(u1.getAge());

    }
}

