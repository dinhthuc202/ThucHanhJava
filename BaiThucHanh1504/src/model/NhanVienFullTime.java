package model;

import util.Configs;

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

    public void setLoaiChucVu(int loaiChucVu)
    {
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien()
    {
        return "Nhân viên toàn thời gian";
    }

    public void tinhLuong(){
        if (loaiChucVu == Configs.NHAN_VIEN_SEP) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        } else {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        }
    }
}
