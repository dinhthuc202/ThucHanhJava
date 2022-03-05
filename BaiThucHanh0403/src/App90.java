import java.util.Scanner;
public class App90 {
    public static void main(String[] args)throws Exception{
        String chuoi;
        char kytu;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ki tu bat ki: ");
        chuoi = sc.nextLine();
        for(int i = 0;i < chuoi.length();i++)
        {
            kytu = chuoi.charAt(i);
            System.out.println(kytu);
        }
        sc.close();
    }
}
