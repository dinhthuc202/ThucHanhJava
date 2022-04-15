import Getter_Settter.SinhVien;

public class App72 {
    public static void main(String [] args ){
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();

        sv1.setTen("");//Không có tên
        sv1.setTuoi(23);
        
        sv2.setTen("Peter");
        sv2.setTuoi(17);

        System.out.println("Sinh viên 1 có tên: " + sv1.getTen() + ", Tuổi: " + sv1.getTuoi());
        System.out.println("Sinh viên 2 có tên: " + sv2.getTen() + ", Tuổi: " + sv2.getTuoi());
    }
}
