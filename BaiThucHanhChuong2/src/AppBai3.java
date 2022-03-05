import java.util.Scanner;
public class AppBai3 {
    public static void main(String[] args) throws Exception{
        String Ten;
        int Tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        Ten = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        Tuoi = sc.nextInt();
        if (Tuoi < 16) {
            System.out.print("Ban " + Ten + " o do tuoi vi thanh nien.");
        }else if (Tuoi >= 16 && Tuoi <= 18) {
            System.out.print("Ban " + Ten + " o do tuoi truong thanh.");
        } else {
            System.out.print("Ban " + Ten + " da gia.");
        }
        sc.close();
    }
}
