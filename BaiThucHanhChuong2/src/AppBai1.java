import java.util.Scanner;
public class AppBai1 {
    public static void main(String[] args) throws Exception {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b= ");
        b= sc.nextInt();
        System.out.println(a + " + " + b + " = "  + (a + b));
        System.out.println(a + " - " + b + " = "  + (a - b));
        System.out.println(a + " * " + b + " = "  + (a * b));
        System.out.println(a + " / " + b + " = "  + (a / b));
        System.out.println("du : "+ (a % b));
        if (a > b)
            System.out.println(a + " > " + b);
        else if (a == b)
            System.out.println(a + " = "+ b);
        else
            System.out.println(a + " < " + b);
        sc.close();
    }
}
