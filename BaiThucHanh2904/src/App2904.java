import Shape.Point;
import Shape.Quadrilateral;
import Shape.Triangle;

public class App2904 {
    public static void main(String[] args) throws Exception {

        System.out.println(" ");
        Point p1 = new Point("A",2,3);
        p1.OutPoint();

        System.out.println("\nNhập điểm: \n");
        Point p2 = new Point();
        p2.InPoin();
        p2.OutPoint();
    
        Triangle t1 = new Triangle();
        t1.InTriangle();
        System.out.println(" ");
        t1.OutTriangle();

        Quadrilateral q1 = new Quadrilateral();
        q1.InQuadrilateral();
        System.out.println(" ");
        q1.OutQuadrilateral();
    
    }
}
