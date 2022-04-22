package Employee;

public class PartTimeEmployee extends Employee{
    private int GioLamViec; //Tổng số giờ làm việc của nhân viên

    @Override
    public void nhaptt()
    {
        System.out.println("Tổng số giờ làm việc: "+ GioLamViec);
    }

    @Override
    public String loaiNhanVien()
    {
        return "Nhân viên thời vụ";
    }

    public void tinhLuong(){
        luong = LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * GioLamViec;
    }
}
