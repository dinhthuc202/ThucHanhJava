import java.util.Scanner;

public class SinhVien<DateTime> {
    String MaSinhVien;
    String HoTen;
    boolean GioiTinh;
    String DiaChi;
    DateTime NgaySinh;

    private static Scanner sc = new Scanner(System.in);

    void nhapMaSinhVien() {
        System.out.print("Nhap ma sinh vien: ");
        MaSinhVien = sc.nextLine();
    }
    void nhapHoTen(){
        System.out.print("Ho ten: ");
        HoTen = sc.nextLine();
    }
    void nhapGioiTinh(){
        System.out.print("Gioi tinh (false-nam | true-nu): ");
        GioiTinh = sc.nextBoolean();
    }
    void nhapDiaChi(){
        System.out.println("Dia chi: ");
        DiaChi = sc.nextLine();
    }
    void nhapNgaySinh(){
        System.out.print("Nhap ngay sinh: ");
        NgaySinh = (DateTime) sc.nextLine();
    }

    void intt() {
        System.out.println("\nMa sinh vien: " + MaSinhVien);
        System.out.println("Ho ten sinh vien: " + HoTen);
        if (GioiTinh == false) {
            System.out.println("Gioi tinh: Nam");
        } else {
            System.out.println("Gioi tinh: Nu");
        }
        System.out.println("Ngay sinh: " + NgaySinh);
        System.out.println("Dia chi: " + DiaChi);
    }
}