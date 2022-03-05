import java.util.Scanner;
public class AppBai2 {
    public static void main(String[] args) throws Exception{
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tu nhien bat ki: ");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("So vua nhap la so chan.");
        } else {
            System.out.println("So vua nhap la so le.");
        }
        sc.close();
    }
}
