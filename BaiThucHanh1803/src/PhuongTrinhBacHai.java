import java.util.Scanner;

public class PhuongTrinhBacHai {
    int a,b,c;
    float x1,x2;
    private static Scanner sc = new Scanner(System.in);
    void nhapgiatri(){
        System.out.println("Nhap phuong trinh bac 2 co dang ax^2 + bx + c = 0 .");
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        System.out.print("c = ");
        c = sc.nextInt();
    }
    int giaiptb2(){
        if (a == 0) {
            if (b == 0)
                return 0;
            else {
                    x1= -c / b;
                    return 1;
            }
        }
        // tính delta
        float delta = b*b - 4*a*c;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            return 2;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            return 1;
        } else {
            return 0;
        }
    }
    public void inkq(int a) {
        if (a == 0) {
            System.out.print("PT vo nghiem");
        } else if (a == 1) {
            System.out.print("PT co nghiem kep x= " + x1);
        } else if(a == 2){
            System.out.print("PT co 2 nghiem la: x1 = " + x1 + " va x2 = " + x2);
        }
    }
}
