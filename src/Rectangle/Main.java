package Rectangle;

public class Main {
        public static void main(String[] args) {
            Rectangle Rec1 = new Rectangle(7,10);
            Rectangle Rec2 = new Rectangle(6,8);
            if(Rec1.Area()>Rec2.Area())
                System.out.println("Rectangle1 > Rectangle2");
            else if(Rec1.Area()<Rec2.Area())
                System.out.println("Rectangle1 < Rectangle2");
            else
                System.out.println("They are equal");
        }
}
