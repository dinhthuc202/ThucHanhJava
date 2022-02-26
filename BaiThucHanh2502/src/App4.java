import java.util.Scanner;
public class App4 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Liet ke cac so nguyen to nho hon n.");
        
        //Nhap va kiem tra n la so nguyen duong
        do {
            System.out.println("n= ");
            n = sc.nextInt();
            if(n < 0)
                System.out.println("Gia tri khong hop le. Vui long nhap lai.");
        } while (n < 0);

        //In ra cac so nguyen to nho hon n
        System.out.println("Cac so nguyen to nho hon n la: ");
        if (n > 2) {
            System.out.println("2");
            for(int i = 3;i < n;i++)
            {
                if(SNT(i)==true)
                    System.out.println(i);
            }
        } else {
            System.out.println("Khong co so nguyen to nho hon n.");
        }
        sc.close();
    }
    //Kiem tra so nguye to
    public static boolean SNT(int a){
        if (a < 2){
            return false;
        }          
        for (int i = 2; i < (a - 1); i++){
            if (a % i == 0){
                return false;
            }   
        }
        return true;
    }
}
