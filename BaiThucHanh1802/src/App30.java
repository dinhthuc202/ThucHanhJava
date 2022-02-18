import java.util.Scanner;
public class App30 {
    public static void main(String[] args) throws Exception {
        //Khai bao bien
        int a=-1, sodu, tong=0;
        //Khai bao doi tuong Scanner de doc du lieu
        Scanner sc = new Scanner(System.in);
        //Nhap so nguyen duong
        do
        {
            System.out.println("Nhap so a: ");
            a = sc.nextInt();
            if(a<0)
                System.out.println("Gia tri khong hop le. Vui long nhap lai.");
        }
        while(a<0);
        //Tinh tong
        while (a!=0)
        {
            sodu = (int) (a%10);
            tong += sodu;
            a = (int) (a/10);
        }
        //In tong
        System.out.println("Tong cac chu so = " + tong);
        sc.close();
    }
}
