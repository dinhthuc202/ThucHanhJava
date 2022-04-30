package Shape;

import java.util.Scanner;

public class Point {
    private String TenDiem;
    private float x;
    private float y;

    public static Scanner sc = new Scanner(System.in);

    public Point(){
    }
    //----
    public String getTenDiem()
    {
        return TenDiem;
    }

    public void setTenDiem(String TenDiem)
    {
        this.TenDiem = TenDiem;
    }
    //----
    public float getX()
    {
        return x;
    }

    public void setX(float x)
    {
        this.x = x;
    }
    //----
    public float getY()
    {
        return y;
    }

    public void setY(float y)
    {
        this.y = y;
    }
    //Khởi tạo nhận 1 kí tự và 2 số thực làm tham số
    public Point (String TenDiem, float x, float y)
    {
        this.TenDiem = TenDiem;
        this.x = x;
        this.y = y;
    }
    //Nhập
    public void InPoin()
    {
        System.out.print("Tên điểm: ");
        setTenDiem(sc.nextLine());
        System.out.print("Hoành độ: ");
        setX(sc.nextFloat());
        System.out.print("Tung độ: ");
        setY(sc.nextFloat());

        sc.nextLine();//Xóa phím enter còn trong bộ nhớ
    }
    //In
    public void OutPoint()
    {
        System.out.println(TenDiem + "(" + x + "," + y + ")");
    }
}
