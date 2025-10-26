package Enum.swith_case;

enum colour{
    Red, White, Black, Green, Yellow
        }
public class new1 {
    public static void main(String[] args) {

        colour c = colour.Green;
        switch (c){
         case Red :
             System.out.println("Red Colour");
             break;
         case White :
             System.out.println("White Colour");
             break;
         case Black:
             System.out.println("Blaack Colour");
         case Green:
             System.out.println("Green Colour");
             break;
         case Yellow:
             System.out.println("Yellow Colour");
             break;
         default:
             System.out.println("NOT Colour");
         }
    }
}
