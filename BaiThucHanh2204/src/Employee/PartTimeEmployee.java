package Employee;

public class PartTimeEmployee extends Employee{
    private int GioLamViec; //Tổng số giờ làm việc của nhân viên

    public void nhapttPartTime()
    {
        nhapttEmployee();
        System.out.print("Tổng số giờ làm việc: ");
        GioLamViec = sc.nextInt();
    }

    public void inttPartTimne()
    {
        inttEmployee();
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
