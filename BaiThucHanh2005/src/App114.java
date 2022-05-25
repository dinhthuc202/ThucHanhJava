import java.util.HashMap;
import java.util.Scanner;

public class App114 {
    public static void main(String [] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        HashMap<String,SinhVien> svHashMap = new HashMap<>();

        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            SinhVien sv = new SinhVien();
            sv.nhap();
            svHashMap.put(sv.getMa_Sinh_Vien(), sv);
        }



        sc.close();
    }
}

class SinhVien{
    private String Ma_Sinh_Vien;
    private String Ho_Ten;
    private String Lop;

    Scanner sc = new Scanner(System.in);
    public SinhVien(){
    }

    public void setMa_Sinh_Vien(String Ma_Sinh_Vien){
        this.Ma_Sinh_Vien = Ma_Sinh_Vien;
    }

    public String getMa_Sinh_Vien(){
        return Ma_Sinh_Vien;
    }

    public void setHo_Ten(String Ho_Ten){
        this.Ho_Ten = Ho_Ten;
    }

    public String getHo_Ten(){
        return Ho_Ten;
    }

    public void setLop(String Lop){
        this.Lop = Lop;
    }

    public String getLop(){
        return Lop;
    }

    public void nhap(){
        System.out.print("Mã sinh viên: ");
        Ma_Sinh_Vien = sc.nextLine();
        System.out.print("Họ tên: ");
        Ho_Ten = sc.nextLine();
        System.out.print("Lớp: ");
        Lop = sc.nextLine();
    }
}
