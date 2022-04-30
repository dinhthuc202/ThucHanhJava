package Shape;

public class Triangle extends Point{
    private Point d1;
    private Point d2;
    private Point d3;

    public Triangle()
    {
        d1 = new Point();
        d2 = new Point();
        d3 = new Point();
    }

    public void InTriangle()
    {
        System.out.println("Đỉnh số 1: ");
        d1.InPoin();
        System.out.println("Đỉnh số 2: ");
        d2.InPoin();
        System.out.println("Đỉnh số 3: ");
        d3.InPoin();
    }

    public void OutTriangle()
    {
        System.out.print("Tam giác có tọa độ 3 đỉnh là: \n");
        d1.OutPoint();
        d2.OutPoint();
        d3.OutPoint();
        LoaiTamGiac();
    }

    public void LoaiTamGiac()
    {
        //Sử dụng độ dài bình phương của cạnh để tránh sai số
        //Nếu sử dụng độ dài cạnh thì sẽ lỡ trường hợp tam giác vuông
        double a = Math.pow(d1.getX() - d2.getX(),2) + Math.pow(d1.getY() - d2.getY(), 2);
        double b = Math.pow(d1.getX() - d3.getX(),2) + Math.pow(d1.getY() - d3.getY(), 2);
        double c = Math.pow(d2.getX() - d3.getX(),2) + Math.pow(d2.getY() - d3.getY(), 2);
        System.out.print("diện tích: "+ dientich(d1, d2, d3));

        if( Math.sqrt(a)<Math.sqrt(b) + Math.sqrt(c) && Math.sqrt(b)<Math.sqrt(c) + Math.sqrt(a) && Math.sqrt(c)<Math.sqrt(a) + Math.sqrt(b) ){
            if( a==b+c || b==a+c || c== a+b)
                System.out.print("Đây là tam giác vuông.");
            else if(a==b && b==c)
                System.out.print("Đây là tam giác đều.");
            else if(a==b || a==c || b==c)
                System.out.print("Đây là tam giác cân");
            else if(a > b+c || b > a + c || c > a + b)    
                System.out.print("Đây là tam giác tù.");
            else
                System.out.print("Đây là tam giác nhọn.");
        }
        else
            System.out.print("Ba điểm " + d1.getTenDiem() + "," + d2.getTenDiem() + "," + d3.getTenDiem()
                            + " không tạo thành tam giác.");
    }

    public double dientich(Point a, Point b, Point c)
    {
        return 0.5*Math.abs(a.getX()* (b.getY() - c.getY()) + b.getX()*(c.getY()-a.getY())+c.getX()*(a.getY()-b.getY()));
    }
}
