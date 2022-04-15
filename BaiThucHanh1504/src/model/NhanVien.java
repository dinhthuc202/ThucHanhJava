package model;

public class NhanVien {

    protected String ten;
    protected long luong;

    public NhanVien(){

    }

    public NhanVien(String ten)
    {
        this.ten = ten;
    }

    protected String loaiNhanVien(){
        //Lớp con phải có override để lo vụ loại nhân viên này
        return "";
    }

    public void xuatThongTin(){
        System.out.println("=== Nhân viên: " + ten + " ===");
        System.out.println("- Loại nhân viên: " + loaiNhanVien());
        System.out.println("- Lương: " + luong + " VND");
    }
}
