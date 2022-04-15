package model;

public class NhanVienFullTime extends NhanVien{
    private int ngayLamThem;//Số ngày làm thêm
    private int loaiChucVu;

    public NhanVienFullTime(String ten){
        this.ten = ten;
    }

    public NhanVienFullTime(String ten,int ngayLamThem)
    {
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }
}
