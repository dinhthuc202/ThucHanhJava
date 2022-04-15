package Shapes;

import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
    public float cDai;
    public float cRong;

    public HinhChuNhat()
    {
        ten = "Hình Chữ Nhật";
    }

    public void nhapChieuDai()
    {
        System.out.println("Chiều dài = ");
        Scanner sc = new Scanner(System.in);
        cDai = sc.nextFloat();
    }

    public void nhapChieuRong()
    {
        System.out.println("Chiều rộng = ");
        Scanner sc = new Scanner(System.in);
        cRong = sc.nextFloat();
    }

    public void tinhChuVi()
    {
        chuVi = 2 * ( cDai + cRong );
    }

    public void tinhDienTich()
    {
        dienTich = cDai * cRong;
    }
}
