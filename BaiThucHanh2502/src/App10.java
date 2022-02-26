import java.util.Scanner;
public class App10 {
    public static void main(String[] args)throws Exception{
        int n,in,dem=1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap so nguyen duong: ");
            n = sc.nextInt();
            if(n<0)
                System.out.println("Gia tri khong hop le. Vui long nhapn lai.");
        } while (n<0);
        in=n;//in de in ra man hinh
        while (n/10!=0) {
            dem++;
            n/=10;
        }
        System.out.println("So chu so cua "+ in+" la: "+ dem);
        sc.close();
    }
    
}