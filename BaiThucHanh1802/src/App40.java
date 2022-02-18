import java.util.Scanner;
public class App40 {
    public static void main(String[] args) throws Exception {
        //Khai bao bien
        byte ngay;
        //Khai bao doi tuong Scanner de doc du lieu
        Scanner sc = new Scanner(System.in);
        //Nhap so ngay trong tuan
        do {
            System.out.println("Nhap so ngay(1 --> 7): ");
            ngay = sc.nextByte();
            if(ngay < 1 || ngay >7)
            System.out.println("Gia tri khong hop le. Vui long nhap lai.");
        } while (ngay < 1 || ngay >7);
        switch (ngay) {
            case 1:System.out.println("Thu hai.");
                break;
            case 2:System.out.println("Thu ba.");
                break;
            case 3:System.out.println("Thu tu.");
                break;
            case 4:System.out.println("Thu nam.");
                break;
            case 5:System.out.println("Thu sau.");
                break;
            case 6:System.out.println("Thu bay");
                break;
            case 7:System.out.println("Chu nhat");
                break;
        }
        sc.close();
    }
}
