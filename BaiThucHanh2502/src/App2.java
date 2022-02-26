import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
      float a,b,c;
      Scanner sc = new Scanner(System.in);
//Nhap gia tri 3 canh
      System.out.println("Nhap so do 3 canh cua tam giac.");
      System.out.println("a= ");
      a = sc.nextFloat();
      System.out.println("b= ");
      b = sc.nextFloat();
      System.out.println("c= ");
      c = sc.nextFloat();
//Xet loai tam giac
    if( a<b+c && b<a+c && c<a+b )
    {
        if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
            System.out.println("Tam giac vuong.");
        else if(a==b && b==c)
            System.out.println("Tam giac deu.");
        else if(a==b || a==c || b==c)
            System.out.println("Tam giac can.");
        else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b) 
            System.out.println("Tam giac tu.");
        else
            System.out.println("Tam giac nhon.");
    }
    else
        System.out.println("Khong la tam giac.");
      sc.close();
    }
}