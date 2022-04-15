package model;
import util.Configs;

public class NhanVienPartTime extends NhanVien{
    private int GioLamViec; //Tổng số giờ làm việc của nhân viên

    public NhanVienPartTime(String ten, int GioLamViec){
        this.ten = ten;
        this.GioLamViec = GioLamViec;
    }

    @Override
    public String loaiNhanVien()
    {
        return "Nhân viên thời vụ";
    }

    public void tinhLuong(){
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * GioLamViec;
    }
}
