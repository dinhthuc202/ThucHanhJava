package Shapes;

import java.util.Scanner;
public class HinhTron extends HinhHoc {
    public float banKinh;
    public HinhTron()
    {
        ten = "Hình Tròn";
    }
    public void nhapBanKinh()
    {
        System.out.println("Bán kính = ");
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextFloat();
    }
    public void tinhChuVi()
    {
        chuVi = 2 * PI * banKinh;
    }
    public void tinhDienTich()
    {
        dienTich = PI * banKinh * banKinh;
    }
}
