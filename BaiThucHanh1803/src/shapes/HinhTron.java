package shapes;

import java.util.Scanner;
public class HinhTron {
    
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;
    Scanner sc = new Scanner(System.in);
    public void NhapBanKinh()
    {
        System.out.print("Nhap vao ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }

    public void tinhChuVi()
    {
        cv = 2 * PI * r;
    }

    public void tinhDienTinh()
    {
        dt = PI * r * r;
    }
    public void inChuVi()
    {
        System.out.print("\nChu vi hinh tron: " + cv);
    }
    public void inDienTich()
    {
        System.out.print("\nDien tich hinh tron: " + dt);
    }
}