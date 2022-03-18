import shapes.HinhTron;
import shapes.HinhChuNhat;

public class App {
    public static void main(String[] args) throws Exception {
        HinhTron ht = new HinhTron();
        HinhChuNhat hcn = new HinhChuNhat();

        //Hinh tròn
        ht.NhapBanKinh();
        ht.tinhChuVi();
        ht.inChuVi();
        ht.tinhDienTinh();
        ht.inDienTich();

        System.out.print("\n\n");
        //Hình Vuông
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTinh();
        hcn.inChuVi();
        hcn.inDienTich();
        
    }
}
