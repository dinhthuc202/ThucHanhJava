import java.util.Scanner;
public class App74 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.print("Nhap so phan tu cua mang: ");
            n = sc.nextInt();
            if(n < 0)
                System.out.println("\nGia tri khong hop le. Vui long nhap lai !");
        }while(n < 0);
        int a[]= new int [n];
        System.out.println("\nNhap phan tu cho mang.");
        for(int i=0;i<n;i++)
        {
            System.out.print("Phan tu so "+ (i+1) + " : ");
            a[i] = sc.nextInt();
        }
        int tong = 0;
        for(int i = 0; i < n;i++)
        {
            if(a[i] % 2 == 0)
                tong = tong + a[i];
        }
        System.out.println("\nTong cua cac so chan trong mang vua nhap la: " + tong);
        sc.close();
    }
}
