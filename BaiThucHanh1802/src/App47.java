import java.util.Scanner;
public class App47 {
    public static void main (String[] agrs) throws Exception{
        //khai bao bien
        int n, tong=0;
        //Khai bao doi tuong Scanner de doc du lieu
        Scanner sc = new Scanner(System.in);
        //Nhap so nguyen bat ki va tinh tong cac so neu tong>100 thi dung
        do {
            System.out.println("Nhap so nguyen bat ki: ");
            n = sc.nextInt();
            tong += n;
        } while (tong <= 100);
        System.out.println("Tong cac so nguyen vua nhap la: "+ tong);
        sc.close();
    }
}
