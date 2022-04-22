package Person;

import java.util.Scanner;

public class Person {
    private String Hoten;
    private int Tuoi;
    private String GioiTinh;

    public static Scanner sc = new Scanner(System.in);
    
    protected void nhaptt()
    {
        System.out.print("Họ tên: ");
        Hoten = sc.nextLine();

        System.out.print("Giới tính: ");
        GioiTinh = sc.nextLine();
    
        System.out.print("Tuổi: ");
        Tuoi = sc.nextInt(); 
    }

    protected void intt()
    {
        System.out.println("Họ tên: " + Hoten);
        System.out.println("Giới tính: " + GioiTinh);
        System.out.println("Tuổi: " + Tuoi);
    }
}
