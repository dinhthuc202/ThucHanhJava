import Shapes.HinhChuNhat;
import Shapes.HinhTron;
import Shapes.HinhTru;
import Shapes.HinhVuong;

public class App54 {
    public static void main(String[] args) throws Exception {
        
        //Hình tròn
        HinhTron hinhtron = new HinhTron();
        hinhtron.xuatTen();
        hinhtron.nhapBanKinh();
        hinhtron.tinhChuVi();
        hinhtron.tinhDienTich();
        hinhtron.inchuVi();
        hinhtron.indienTich();
        
        //Hinh trụ
        HinhTru hinhtru = new HinhTru();
        hinhtru.nhapChieuCao();
        hinhtru.tinhTheTich();
        hinhtru.intheTich();
        
        //Hình Chữ Nhật
        HinhChuNhat hinhchunhat = new HinhChuNhat();
        hinhchunhat.nhapChieuDai();
        hinhchunhat.nhapChieuRong();
        hinhchunhat.tinhChuVi();
        hinhchunhat.tinhDienTich();
        hinhchunhat.inchuVi();
        hinhchunhat.indienTich();
        
        //Hình Vuông
        HinhVuong hinhvuong = new HinhVuong();
        hinhvuong.nhapCanh();
        hinhvuong.tinhChuVi();
        hinhvuong.tinhDienTich();
        hinhvuong.inchuVi();
        hinhvuong.indienTich();
    }
}
