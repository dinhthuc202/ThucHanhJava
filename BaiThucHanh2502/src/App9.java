import java.util.Scanner;
public class App9 {
    public static void main(String[] args)throws Exception{
        int n1,n2,SND,tmp;//n2 de in ra man hinh
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap so nguyen duong can dao nguoc: ");
            n1 = sc.nextInt();
            if(n1<0)
                System.out.println("Gia tri khong hop le. Vui long nhapn lai.");
        } while (n1<0);
        n2 = n1;
        SND = 0;
        while(n1!=0)
        {
            tmp = n1 % 10;
            SND = SND*10 + tmp;
            n1 = n1 / 10;
        }
        System.out.println("So dao nguoc cua " + n2 +" la : " + SND);
        sc.close();
    }
}
