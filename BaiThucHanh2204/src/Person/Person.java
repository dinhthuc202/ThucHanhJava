package Person;

import java.util.Scanner;

public class Person {
    private String Hoten;
    private int Tuoi;
    private String GioiTinh;
    public static Scanner sc = new Scanner(System.in);

    
    public void nhaptt()
    {
        System.out.print("Họ tên: ");
        Hoten = sc.nextLine();
    
        System.out.print("Tuổi: ");
        Tuoi = sc.nextInt();
    
        System.out.print("Giới tính: ");
        GioiTinh = sc.nextLine();
    }

    public void intt()
    {
        System.out.println("Họ tên: " + Hoten);
        System.out.println("Tuổi: " + Tuoi);
        System.out.println("Giới tính: " + GioiTinh);
    }
}
