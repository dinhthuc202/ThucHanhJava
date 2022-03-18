import java.util.Scanner;
public class HinhTron {
    public static void main(String[] args) throws Exception {
        HinhTron ht = new HinhTron();
        ht.NhapBanKinh();
        ht.TinhChuVi();
        ht.inChuVi();
        ht.TinhDienTinh();
        ht.inDienTich();
    }

    final float PI = 3.14f;
    float r;
    float cv;
    float dt;
    void NhapBanKinh()
    {
        System.out.print("Nhap vao ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
        sc.close();
    }

    void TinhChuVi()
    {
        cv = 2 * PI * r;
    }

    void TinhDienTinh()
    {
        dt = PI * r * r;
    }
    void inChuVi()
    {
        System.out.print("\nChu vi hinh tron: " + cv);
    }
    void inDienTich()
    {
        System.out.print("\nDien tich hinh tron: " + dt);
    }
}