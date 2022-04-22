package Employee;

public class FullTiemEmployee extends Employee{
    private int ngayLamThem;//Số ngày làm thêm
    private int loaiChucVu;

    @Override
    public void nhaptt()
    {
        System.out.print("Số ngày làm thêm: ");
        ngayLamThem = sc.nextInt();
        do {
            System.out.print("Loai chức vụ: 1 - Sếp|| 2- Lính : ");
            loaiChucVu = sc.nextInt();
            if (loaiChucVu != 1 && loaiChucVu !=2) {
                System.out.print("Giá trị không hợp lệ. Vui lòng nhập lại.");
            }
        } while (loaiChucVu != 1 && loaiChucVu !=2);
    }

    @Override
    public String loaiNhanVien()
    {
        return "Nhân viên toàn thời gian";
    }

    public void tinhLuong(){
        if (loaiChucVu == NHAN_VIEN_SEP) {
            luong = LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * LUONG_LAM_THEM_MOI_NGAY;
        } else {
            luong = LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * LUONG_LAM_THEM_MOI_NGAY;
        }
    }
}
