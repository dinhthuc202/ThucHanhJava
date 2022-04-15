package Static;

public class Configs {
    //Cấu hình số lượng hình học
    public static final int So_Luong_Hinh_Toi_Thieu = 0;
    public static final int So_Luong_Hinh_Toi_Da = 5;

    //Các cấu hình khác
    public static final float PI = 3.14f;
    public static final float Inch_Cm = 2.54f;//1 inch = 2.54 cm
    public static final int Don_Vi_Cm = 1; //Đánh dấu ưng dụng đang dùng đơn vị gì
    public static final int Don_Vi_Inch = 2; //Đánh dấu ưng dụng đang dùng đơn vị gì
    public static int donVi = Don_Vi_Cm; //Cờ cho biết đang dùng đơn vị gì

    //Phương thức Static giúp chuyển đơn vị từ CM sang INCH
    public static float Chuyen_Cm_Sang_Inch(float cm)
    {
        float inch = cm / Inch_Cm;
        return inch;
    }

    //Phương thức Static giúp chuyển đơn vị từ Inch sang Cm
    public static float Chuyen_Inch_Sang_Cm(float inch)
    {
        float cm = inch * Inch_Cm;
        return cm;
    }

    

}
