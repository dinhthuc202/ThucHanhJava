import java.util.Scanner;
public class App5 {
    public static void main(String[] args)throws Exception{
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiem tra so hoan thien.");
        //Nhap 1 so nguyen duong
        do {
            System.out.println("a= ");
            a = sc.nextInt();
            if (a < 0) {
                System.out.println("Gia tri khong hop le. Vui long nhap lai.");
            }
        } while (a<0);
        //In ra ket qua
        if (check(a) == true)
            System.out.println(a+" la so hoan thien.");
        else
            System.out.println(a+" khong la so hoan thien.");
        sc.close();
    }
    //Kiem tra so hoan thien
    public static boolean check(int a){
        int tong = 0;
        for(int i = 1;i <= a/2;i++){
            if((a % i) == 0)
                tong+=i;
        }
        if (tong == a) {
            return true;
        }
        return false;
    }
}