package Static;
import java.util.Scanner;

import Shapes.HinhHoc;

public class HinhTron extends HinhHoc{
    protected float banKinh;
    private Scanner sc;

    //Constructor
    public HinhTron(){
        super();
        sc = new Scanner(System.in);
    }

    public void nhapBanKinh() {
        //Nhập đơn vị tính là Cm hoặc Inch
        System.out.println("Bạn dùng đơn vị nào: ");
        System.out.println("\t1 - Centimet");
        System.out.println("\t2 - Inch");
        Configs.donVi = sc.nextInt();

        //Nhập bán kính
        System.out.println("Hãy nhập bán kính hình tròn: ");
        banKinh = sc.nextFloat();
    }

    public void inThongTin() {
        if (Configs.donVi == Configs.Don_Vi_Cm) {
            System.out.println("Hình tròn có bán kính: "+ banKinh + " cm");
            System.out.println("Tương đương " + Configs.Chuyen_Cm_Sang_Inch(banKinh) + " inch");
        } else {
            System.out.println("Hình tròn có bán kính: "+ banKinh + " inch");
            System.out.println("Tương đương " + Configs.Chuyen_Inch_Sang_Cm(banKinh) + " cm");
        }
    }
}
